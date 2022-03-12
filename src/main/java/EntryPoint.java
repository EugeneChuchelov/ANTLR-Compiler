import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class EntryPoint {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            return;
        }
        CharStream in = CharStreams.fromFileName(args[0]);
        antlr4.LanguageLexer lexer = new antlr4.LanguageLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        antlr4.LanguageParser parser = new antlr4.LanguageParser(tokens);
        antlr4.LanguageParser.ProgramContext program = parser.program();
        program.accept(new antlr4.LanguageBaseVisitor<>());

        System.out.println(program.toStringTree());
    }
}
