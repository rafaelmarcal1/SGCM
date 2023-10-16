package model;

public class Teste {
    public static void main(String[] args) throws Exception {
        
        // objeto que mapea (mapeamento Objeto/Relacional uma linha na tabela Especialidade
        // objeto persistente
//        Especialidade especialidade = new Especialidade();        
//        especialidade.setCodigoEspecialidade(13);
//        especialidade.setDescricaoEspecialidade("Dermatologia");       
//        // salve no banco de dados -- faz a persistência de dados
//        especialidade.save();

//        Especialidade especialidade = new Especialidade();
//        // especifica a chave primária
//        especialidade.setCodigoEspecialidade(13);
//        // busca (preenche o objeto) os dados no banco de dados
//        especialidade.load();
//        System.out.println( especialidade.getDescricaoEspecialidade() );
//        especialidade.setDescricaoEspecialidade("??");
//        especialidade.save();

        Especialidade especialidade = new Especialidade();
        especialidade.setCodigoEspecialidade(13);
        especialidade.load();
        System.out.println( especialidade.getDescricaoEspecialidade() );
        especialidade.delete();
        
        
        
    }
}