grammar Language;

WS: [ \t\r\n]+ -> skip ;
Comment: '/*' .*? '*/' -> skip;

RelationOperator: 'NE'|'EQ'|'LT'|'LE'|'GT'|'GE';
AdditionOperator: 'plus'|'min'|'or';
MultiplicationOperator: 'mult'|'div'|'and';
UnaryOperator: '~';

Type: 'integer'|'real'|'boolean';
LogicalConstant: 'true'|'false';
fragment Letter: [a-zA-Z];
fragment Digit: [0-9];
Identificator: Letter (Letter | Digit)*;

Number: (Integer | Real);
Integer: (Binary|Octal|Decimal|Heximal);
Binary: [01]+ ('b'|'B');
Octal: [0-7]+ ('o'|'O');
Decimal: Digit+ ('d'|'D')?;
Heximal: (Digit|[a-fA-F])+ ('h'|'H');
Real: DigitLine Exponent|(DigitLine? '.' DigitLine Exponent?);
DigitLine: Digit+;
Exponent: ('e'|'E') ('-'|'+')? DigitLine;

multiplier: (Identificator|Number|LogicalConstant|UnaryOperator multiplier|'(' expression ')');
term: multiplier (MultiplicationOperator multiplier)*;
operand: term (AdditionOperator term)*;
expression: operand (RelationOperator operand)*;

description: Type Identificator (',' Identificator)*;

operator: (complex|assignment|condition|fixedCycle|conditionCycle|input|output);
complex: '{' operator (';' operator)* '}';
assignment: 'let'? Identificator '=' expression;
condition: 'if' expression 'then' operator ('else' operator)? 'end_else';
fixedCycle: 'for' '(' expression? ';' expression? ';' expression? ')' operator;
conditionCycle: 'do' 'while' expression operator 'loop';
input: 'input' '(' Identificator Identificator* ')';
output: 'output' '(' expression expression* ')';

program: '{' ((description|operator) ';')+ '}';
