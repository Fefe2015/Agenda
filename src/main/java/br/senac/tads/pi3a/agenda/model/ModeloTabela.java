/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.agenda.model;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Fernanda
 */
public class ModeloTabela extends AbstractTableModel{
    
    private ArrayList linhas = null;// armazena dados das linhas que vem do BD
    private String[] colunas = null;// armazena os dados que vem das colunas do BD
    
    // metodo responsavel por setar quantidade de linhas e colunas
    //montar a tabela
    
    public ModeloTabela(ArrayList lin, String[] col){
        setLinhas(lin); //seta linhas e colunas vindas do BD
        setColunas(col);
    }
    public ArrayList getLinhas(){
        return linhas;
    }
    public void setLinhas(ArrayList dados){
        linhas = dados;        
    }
    public String[] getColunas(){
       return colunas;
    }
    public void setColunas(String[] nome){
        colunas = nome;
    }
    @Override
    public int getColumnCount(){ //contando linhas
        return colunas.length;
    }
    @Override
    public int getRowCount(){ //contando colunas
        return linhas.size();
    }
    @Override
    public String getColumnName(int numCol){ //contando os nomes de cada coluna
        return colunas[numCol];             // retornando os nomes das colunas
    }

    @Override
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin); // pegando valores de quantidade de linhas e colunas
        return linha[numCol]; // retorna para tabela a quantidade de linhas que foi passada
        
    }
}