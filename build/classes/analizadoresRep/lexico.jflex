//******************************************************************************
//**                       Importar paquetes                                  **
//******************************************************************************

package analizadoresRep;

//******************************************************************************
//**                       Importar librería                                  **
//******************************************************************************

import java_cup.runtime.*;
import almacenamiento.Errores;
import java.util.ArrayList;

//Scanner
//Descripción del proyecto

%%
%{
//Codigo de usuario
String cadena = "";
public ArrayList<Errores> listaErrores = new ArrayList<Errores>();
public String archivoActual = "";
%}

%cup
%class scannerRep
%public
%line
%char
%column
%full
%state CADENA
%ignorecase 


//Token = "lexema" ó expresión regular
R_ARCHIVO = "archivo"
R_LEERARCHIVO = "leerarchivo"
R_NUMERICO = "numerico"
R_SUMAR = "sumar"
R_CONTAR = "contar"
R_PROMEDIO = "promedio"
R_CONTARSI = "contarsi"
R_CADENA = "cadena"
R_OBTENERSI = "obtenersi"
R_IMPRIMIR = "imprimir"
R_GRAFICAR = "graficar"
COMA = ","
IGUAL = "="
PARENTESISABRE = "("
PARENTESISCIERRA = ")"
PUNTOCOMA = ";"
MAYORQUE = ">"
MENORQUE = "<"
NOIGUAL = "!"
SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]
NUMERO  = [+-]?[0-9]+([.][0-9]+)?
ID = [A-Za-zñÑ][_0-9A-Za-zñÑ]*
COMENTARIOU=("//".*\r\n)|("//".*\n)|("//".*\r)
COMENTARIOM ="/*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/"

%%

<YYINITIAL> {R_ARCHIVO}                     {return new Symbol(sym.R_ARCHIVO, yyline, yycolumn, yytext());}
<YYINITIAL> {R_LEERARCHIVO}                 {return new Symbol(sym.R_LEERARCHIVO, yyline, yycolumn, yytext());}
<YYINITIAL> {R_NUMERICO}                    {return new Symbol(sym.R_NUMERICO, yyline, yycolumn, yytext());}
<YYINITIAL> {R_SUMAR}                       {return new Symbol(sym.R_SUMAR, yyline, yycolumn, yytext());}
<YYINITIAL> {R_CONTAR}                      {return new Symbol(sym.R_CONTAR, yyline, yycolumn, yytext());}
<YYINITIAL> {R_PROMEDIO}                    {return new Symbol(sym.R_PROMEDIO, yyline, yycolumn, yytext());}
<YYINITIAL> {R_CONTARSI}                    {return new Symbol(sym.R_CONTARSI, yyline, yycolumn, yytext());}
<YYINITIAL> {R_CADENA}                      {return new Symbol(sym.R_CADENA, yyline, yycolumn, yytext());}
<YYINITIAL> {R_OBTENERSI}                   {return new Symbol(sym.R_OBTENERSI, yyline, yycolumn, yytext());}
<YYINITIAL> {R_IMPRIMIR}                    {return new Symbol(sym.R_IMPRIMIR, yyline, yycolumn, yytext());}
<YYINITIAL> {R_GRAFICAR}                    {return new Symbol(sym.R_GRAFICAR, yyline, yycolumn, yytext());}
<YYINITIAL> {IGUAL}                         {return new Symbol(sym.IGUAL, yyline, yycolumn, yytext());}
<YYINITIAL> {PARENTESISABRE}                {return new Symbol(sym.PARENTESISABRE, yyline, yycolumn, yytext());}
<YYINITIAL> {PARENTESISCIERRA}              {return new Symbol(sym.PARENTESISCIERRA, yyline, yycolumn, yytext());}
<YYINITIAL> {PUNTOCOMA}                     {return new Symbol(sym.PUNTOCOMA, yyline, yycolumn, yytext());}
<YYINITIAL> {MAYORQUE}                      {return new Symbol(sym.MAYORQUE, yyline, yycolumn, yytext());}
<YYINITIAL> {MENORQUE}                      {return new Symbol(sym.MENORQUE, yyline, yycolumn, yytext());}
<YYINITIAL> {NOIGUAL}                       {return new Symbol(sym.NOIGUAL, yyline, yycolumn, yytext());}
<YYINITIAL> {ID}                            {return new Symbol(sym.ID, yyline, yycolumn, yytext());}
<YYINITIAL> {COMA}                          {return new Symbol(sym.COMA, yyline, yycolumn, yytext());}
<YYINITIAL> {NUMERO}                        {return new Symbol(sym.NUMERO, yyline, yycolumn, yytext());}
<YYINITIAL> {SPACE}                         { /*Espacios en blanco, ignorados*/ }
<YYINITIAL> {ENTER}                         { /*Saltos de linea, ignorados*/}
<YYINITIAL> [\"]                            {yybegin(CADENA); cadena+=""; }
<YYINITIAL> {COMENTARIOU}                   { /*Comentario ignorado*/ }
<YYINITIAL> {COMENTARIOM}                   { /*Comentario ignorado*/ }

<YYINITIAL> . {
        //String errLex = "Error léxico : '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+(yycolumn+1);
        //System.out.println(errLex);
        Errores nuevoError = new Errores(yyline+1, yycolumn+1, 1, "El caracter " + yytext() + " no pertenece al lenguaje", "","", archivoActual);
        listaErrores.add(nuevoError);
}

<CADENA> {
        [\"]    {
                     String tmp="\""+cadena+"\""; cadena=""; yybegin(YYINITIAL);  return new Symbol(sym.CADENA, yychar,yyline,tmp); 
                }
        [\n]    {
                    String tmp=cadena; cadena="";  
                    System.out.println("Se esperaba cierre de cadena (\")."); 
                    Errores nuevoError = new Errores(yyline+1, yycolumn+1, 1, "Se esperaba cierre de cadena [\"]", "","", archivoActual);
                    listaErrores.add(nuevoError); 
                    yybegin(YYINITIAL);
                    yybegin(YYINITIAL);
                }
        [^\"]   {
                    cadena+=yytext();
                }
}


