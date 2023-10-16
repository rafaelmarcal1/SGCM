package model;

import controller.DataAccessObject;
import java.util.ArrayList;

// mapeamento com a tabela especialidades
public class Especialidade extends DataAccessObject {

    private int codigoEspecialidade;
    private String descricaoEspecialidade;

    public Especialidade() {
        super("especialidades");
    }    

    public int getCodigoEspecialidade() {
        return codigoEspecialidade;
    }

    public void setCodigoEspecialidade(int codigoEspecialidade) {
        // verificar se o estado do objeto precisar alterar/modificar
        if( this.codigoEspecialidade !=  codigoEspecialidade ) {
            this.codigoEspecialidade = codigoEspecialidade;
            // informar que um campo da tabela foi alterado
            addChange("codigo_especialidade", 
                    this.codigoEspecialidade);
        }
    }

    public String getDescricaoEspecialidade() {
        return descricaoEspecialidade;
    }

    public void setDescricaoEspecialidade(String descricaoEspecialidade) {
        if( !descricaoEspecialidade.equals( this.descricaoEspecialidade ) ) {
            this.descricaoEspecialidade = descricaoEspecialidade;
             addChange("descricao_especialidade", 
                    this.descricaoEspecialidade);
        }
    }   

    @Override
    protected String getWhereClauseForOneEntry() {
        // utilizar somene chaves primárias
        return " codigo_especialidade = " + this.codigoEspecialidade;
    }

    @Override
    protected void fill(ArrayList<Object> data) {
        // ordem do preenchimento segue a ordem definida na criação da tabela
        this.codigoEspecialidade = (int) data.get(0);
        this.descricaoEspecialidade = (String) data.get(1);
    }

}