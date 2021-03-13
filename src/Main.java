
import gen.langBaseListener;
import gen.langBaseVisitor;
import gen.langLexer;
import gen.langParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        langLexer lexer = new langLexer(CharStreams.fromFileName("src/test.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        langParser parser = new langParser(tokens);

        ParseTree src_context = parser.source_code();
        System.out.println(src_context.toStringTree(parser));
    }

    public static void traverseTreeUsingListener(ParseTree ctx) {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new langBaseListener(), ctx);
    }

    public static void traverseTreeUsingVisitor(langParser.Source_codeContext ctx) {
        langBaseVisitor visitor = new langBaseVisitor();
        visitor.visitSource_code(ctx);
    }

}
