package GeneradoresArchivoDatos;

import java.io.File;

public class GLexico 
{
    public static void main(String[] args) 
    {
        String path="src/AnalizadoresArchivoDatos/a_Lexico.jflex";
        generarLexer(path);
    } 
    
    public static void generarLexer(String path)
    {
        File file=new File(path);
        jflex.Main.generate(file);
    } 
}
