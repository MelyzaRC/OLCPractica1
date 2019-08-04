//******************************************************************************
//**                       Importar paquetes                                  **
//******************************************************************************

package analizadores;

//******************************************************************************
//**                       Importar librería                                  **
//******************************************************************************

import java_cup.runtime.Symbol;

//Scanner
//Descripción del proyecto

%%
%{
//Codigo de usuario
String cadena = "";
String comentario = "";
%}

%cup
%class scanner
%public
%line
%char
%column
%full
%state CADENA
%ignorecase

//Token = "lexema" ó expresión regular
R_CLAVES = "claves"
R_REGISTROS = "registros"
CORCHETEABRE = "["
CORCHETECIERRA = "]"
IGUAL = "="
SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]
NUMERICO  = [0-9]+
COMA = ","
LLAVEABRE = "{"
LLAVECIERRA = "}"
COMENTARIOU=("//".*\r\n)|("//".*\n)|("//".*\r)
COMENTARIOM ="/*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/"

%%

<YYINITIAL> {R_CLAVES}          {return new Symbol(sym.R_CLAVES, yyline, yycolumn, yytext());}
<YYINITIAL> {R_REGISTROS}       {return new Symbol(sym.R_REGISTROS, yyline, yycolumn, yytext());}
<YYINITIAL> {CORCHETEABRE}      {return new Symbol(sym.CORCHETEABRE, yyline, yycolumn, yytext());}
<YYINITIAL> {CORCHETECIERRA}    {return new Symbol(sym.CORCHETECIERRA, yyline, yycolumn, yytext());}
<YYINITIAL> {IGUAL}             {return new Symbol(sym.IGUAL, yyline, yycolumn, yytext());}
<YYINITIAL> {SPACE}             { /*Espacios en blanco, ignorados*/ }
<YYINITIAL> {ENTER}             { /*Saltos de linea, ignorados*/}
<YYINITIAL> {NUMERICO}          {return new Symbol(sym.NUMERICO, yyline, yycolumn, yytext());}
<YYINITIAL> {COMA}              {return new Symbol(sym.COMA, yyline, yycolumn, yytext());}
<YYINITIAL> {LLAVEABRE}         {return new Symbol(sym.LLAVEABRE, yyline, yycolumn, yytext());}
<YYINITIAL> {LLAVECIERRA}       {return new Symbol(sym.LLAVECIERRA, yyline, yycolumn, yytext());}
<YYINITIAL> [\"]                {yybegin(CADENA); cadena+=""; }
<YYINITIAL> {COMENTARIOU}       { /*Comentario ignorado*/ }
<YYINITIAL> {COMENTARIOM}       { /*Comentario ignorado*/ }

<YYINITIAL> . {
        String errLex = "Error léxico : '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+(yycolumn+1);
        System.out.println(errLex);
}

<CADENA> {
        [\"]    {
                     String tmp=cadena+""; cadena=""; yybegin(YYINITIAL);  return new Symbol(sym.CADENA, yychar,yyline,tmp); 
                }
        [\n]    {
                    String tmp=cadena; cadena="";  
                    System.out.println("Se esperaba cierre de cadena (\")."); 
                    yybegin(YYINITIAL);
                }
        [^\"]   {
                    cadena+=yytext();
                }
}


