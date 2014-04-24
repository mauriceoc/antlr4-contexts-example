lexer grammar MyLexer;

WS  : [ \t\r\n]+ -> skip ;
EQ : '=' ;
COMMA : ',' ;

CMD : 'cmd' ;

ID  : [a-zA-Z0-9]+ ;