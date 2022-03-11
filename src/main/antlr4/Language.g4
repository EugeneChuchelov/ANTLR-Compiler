grammar Language;

WS: [ \t\r\n]+ -> skip ;
Comment: '/*' .*? '*/' -> skip;

RelationOperator: 'NE'|'EQ'|'LT'|'LE'|'GT'|'GE';
AdditionOperator: 'plus'|'min'|'or';
MultiplicationOperator: 'mult'|'div'|'and';
UnaryOperator: '~';

Type: 'int'|'float'|'bool';
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

description: Identificator (',' Identificator)*? ':' Type ';';

operator: (complex|assignment|condition|fixedCycle|conditionCycle|input|output);
complex: 'begin' operator (';' operator)* 'end';
assignment: Identificator ':=' expression;
condition: 'if' '(' expression ')' operator ('else' operator)?;
fixedCycle: 'for' assignment 'to' expression ('step' expression)? operator 'next';
conditionCycle: 'while' '(' expression ')' operator;
input: 'readln' Identificator (',' Identificator)*;
output: 'writeln' expression (',' expression)*;

program: '{' ((description|operator) ';')+ '}';
