
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150930 (SVN rev 66)
//----------------------------------------------------

package analizadores;

import java_cup.runtime.Symbol;
import almacenamiento.Clave;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150930 (SVN rev 66) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\014\000\002\002\004\000\002\002\003\000\002\003" +
    "\010\000\002\007\007\000\002\004\005\000\002\004\003" +
    "\000\002\005\006\000\002\005\002\000\002\006\005\000" +
    "\002\006\003\000\002\010\003\000\002\010\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\004\004\007\001\002\000\004\005\020\001" +
    "\002\000\004\002\017\001\002\000\004\002\000\001\002" +
    "\000\004\010\010\001\002\000\004\006\011\001\002\000" +
    "\004\020\013\001\002\000\006\007\015\013\014\001\002" +
    "\000\006\007\ufffc\013\ufffc\001\002\000\004\020\016\001" +
    "\002\000\004\005\ufffe\001\002\000\006\007\ufffd\013\ufffd" +
    "\001\002\000\004\002\001\001\002\000\004\010\021\001" +
    "\002\000\004\006\022\001\002\000\006\007\ufffa\014\ufffa" +
    "\001\002\000\006\007\025\014\024\001\002\000\006\020" +
    "\030\021\031\001\002\000\004\002\uffff\001\002\000\006" +
    "\013\032\015\033\001\002\000\006\013\ufff8\015\ufff8\001" +
    "\002\000\006\013\ufff6\015\ufff6\001\002\000\006\013\ufff7" +
    "\015\ufff7\001\002\000\006\020\030\021\031\001\002\000" +
    "\006\007\ufffb\014\ufffb\001\002\000\006\013\ufff9\015\ufff9" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\010\002\004\003\005\007\003\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\004\011\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\022\001\001\000\002" +
    "\001\001\000\006\006\025\010\026\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\033\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  public CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    //Codigo visible

    public int er = 0;
    public int enr = 0;

    public void syntax_error(Symbol s){
        System.out.println("Error R de sintaxis: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1) );
        er = er+1;
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error NR de sintaxis: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1) );
        enr = enr +1;
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
public class CUP$parser$actions {

//Codigo de acciones

    public String algo = "";
    public ArrayList<Clave> listaClaves = new ArrayList<Clave>();
    public int dimension = 0;
    public ArrayList<Object[]> listaRegistros = new ArrayList<Object[]>();
    public ArrayList<String> temporal = new ArrayList<String>();
    public int buscando = 0;


  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // S ::= INICIO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= SECCIONCLAVES R_REGISTROS IGUAL CORCHETEABRE DEF_REGISTROS CORCHETECIERRA 
            {
              Object RESULT =null;
		
                String imprimir = "Fin del análisis";
                System.out.println(imprimir);
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INICIO",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SECCIONCLAVES ::= R_CLAVES IGUAL CORCHETEABRE DEF_CLAVES CORCHETECIERRA 
            {
              Object RESULT =null;
		
                        if(listaClaves.size() > 0){
                            dimension = listaClaves.size();
                            temporal.clear();
                        }else{
                            System.out.println("Error, no se detectaron claves");
                            temporal.clear();
                        }
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("SECCIONCLAVES",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // DEF_CLAVES ::= DEF_CLAVES COMA CADENA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    if(!a.equals("")){
                        String n = a;
                        String tmpW = "";
                        char[] nue = n.toCharArray();
                        for(int i = 1; i<nue.length-1; i++){
                            tmpW = tmpW + nue[i]; 
                        }
                        if(!tmpW.equals("")){
                            Clave newClave = new Clave(tmpW, 0);
                            listaClaves.add(newClave);
                        }else{
                            System.out.println("Error, el nombre de la clave está vacío");
                        }
                    }
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("DEF_CLAVES",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // DEF_CLAVES ::= CADENA 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    String n = b;
                    String tmpW = "";
                    char[] nue = n.toCharArray();
                    for(int i = 1; i<nue.length-1; i++){
                        tmpW = tmpW + nue[i]; 
                    }
                    if(!tmpW.equals("")){
                        Clave newClave = new Clave(tmpW, 0);
                        listaClaves.add(newClave);
                    }else{
                        System.out.println("Error, el nombre de la clave está vacío");
                    }
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("DEF_CLAVES",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // DEF_REGISTROS ::= DEF_REGISTROS LLAVEABRE LISTA_REGISTROS LLAVECIERRA 
            {
              Object RESULT =null;
		
                        if(temporal.size() == dimension){
                            //si es la primera vez que asigne tipos
                            if(buscando == 0){
                                for(int i = 0; i < temporal.size(); i++){
                                    if(!temporal.get(i).equals("")){
                                        if(temporal.get(i).toCharArray()[0]== '"' &&temporal.get(i).toCharArray()[temporal.get(i).toCharArray().length -1] =='"'){
                                            listaClaves.get(i).tipo = 1;
                                        }else if(temporal.get(i).matches("[+-]?\\d*(\\.\\d+)?") && temporal.get(i).equals("")==false){
                                            listaClaves.get(i).tipo = 0;
                                        }else{
                                            System.out.println("Error no coincide con ningún tipo");
                                        }
                                    }
                                }
                                buscando = 1;
                            }
                            Object[] nAO = new Object[dimension];
                            for(int i = 0; i < dimension; i++){
                                if(listaClaves.get(i).tipo == 1){
                                    String formar = "";
                                    if(temporal.get(i).toCharArray()[0]== '"' &&temporal.get(i).toCharArray()[temporal.get(i).toCharArray().length -1] =='"'){
                                        for(int j = 1; j < temporal.get(i).toCharArray().length-1; j++){
                                            formar = formar + temporal.get(i).toCharArray()[j];
                                        }
                                        nAO[i] = formar;
                                    }else{
                                        System.out.println("Error, se esperaba una cadena");
                                    }
                                }else if(listaClaves.get(i).tipo == 0){
                                    if(temporal.get(i).matches("[+-]?\\d*(\\.\\d+)?") && temporal.get(i).equals("")==false){
                                        nAO[i] = temporal.get(i);
                                    }else{
                                        System.out.println("Error, se esperaba un tipo de dato numerico");
                                    }
                                }
                            }
                            temporal.clear();
                            listaRegistros.add(nAO);
                        }else{
                            System.out.println("Error, el número de claves no concuerda con el registro");
                        }
                        temporal.clear();
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("DEF_REGISTROS",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DEF_REGISTROS ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DEF_REGISTROS",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // LISTA_REGISTROS ::= LISTA_REGISTROS COMA TIPO 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        temporal.add(a);
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA_REGISTROS",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // LISTA_REGISTROS ::= TIPO 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        temporal.add(b);
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA_REGISTROS",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // TIPO ::= NUMERICO 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                RESULT = a;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TIPO ::= CADENA 
            {
              String RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                RESULT = b;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPO",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
