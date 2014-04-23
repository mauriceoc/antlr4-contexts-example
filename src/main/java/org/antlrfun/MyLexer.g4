lexer grammar MyLexer;

ID  : [a-zA-Z0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
EQ : '=' ;
COMMA : ',' ;