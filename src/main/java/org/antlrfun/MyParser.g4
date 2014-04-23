parser grammar MyParser;

options { tokenVocab=MyLexer; }

nameValuePair :
    name EQ value
;

name :
    ID
;

value :
    simpleValue  # simpleValueSubRule
    |
    list # listValueSubRule
;

simpleValue :
    ID
;

list :
    simpleValue (COMMA simpleValue)*
;