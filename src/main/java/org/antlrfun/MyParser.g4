parser grammar MyParser;

options { tokenVocab=MyLexer; }

command :
    cmdName option
;

cmdName :
    CMD
;

option :
    name EQ value
;

name :
    ID
;

value :
    simpleValue  # simpleValueLR
    |
    list # listValueLR
;

simpleValue :
    ID
;

list :
    simpleValue (COMMA simpleValue)*
;