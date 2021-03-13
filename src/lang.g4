grammar lang;

WS
:[ \t\n\r] + -> skip;

// for parser
source_code
:((definition|function_call)EOL)+;

definition
: DEF var_name '=' (function_call|literal);

function_call
: (var_name DOT)? FUN_NAME PARAMS_START START parameters_list END;

parameters_list
: (parameter|((parameter COMMA?)* parameter));

parameter
: (var_name|function_call|literal);

var_name
: CHAR;

literal
: STRING | INT;


// for lexer
DEF
: 'def';

DOT
: '.';

COMMA
: ',';

EOL
: ';';

PARAMS_START
: ':';

START
: '(';

END
: ')';

FUN_NAME
: 'canvas'|'figure'|'line'|'fractal'|'sign'|'color'|'image'|
'gradient'|'add_pattern'|'remove_pattern'|'blur'|'darken'|'lighten'|
'black_white'|'lens'|'mirror';

CHAR
: ([a-z]|'_')([a-z]|'_'|[0-9])+;

INT
: ('0'|[1-9][0-9]*);

STRING
: '\'' (' '|[a-z]|[0-9]|'-'|'_')* '\'';
