/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.agenda.DAO;

import br.senac.tads.pi3a.agenda.connection.Connectionfactory;
import br.senac.tads.pi3a.agenda.model.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernanda
 */
public class ContatoDao {

    private Connection conecta;
    java.util.Date data = new java.util.Date();
    public ContatoDao() throws SQLException {
        this.conecta = Connectionfactory.getConexao();

    }
    
//    public String formataDataHora(java.util.Date data) {
//		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		return formato.format(data);
//	}
//    public java.util.Date converteDataHora(String dataHora) throws ParseException {
//		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		return formato.parse(dataHora);
//	}
    
    public void addContato(Contato contato) throws SQLException {
        //preparando a conexão
        String sql = "insert into contato(nome,data_nasc,email,telefone_fixo,telefone_movel,dt_cadastro)" + "values(?,?,?,?,?,?)";

      //  java.sql.Timestamp timestamp = new java.sql.Timestamp(data.getTime());
        PreparedStatement stmt = conecta.prepareStatement(sql);
        
        //Setando os valores em suas posições
        stmt.setString(1, contato.getNome());
        stmt.setString(2, contato.getDataNasc());
        stmt.setString(3, contato.getEmail());
        stmt.setString(4, contato.getTelFixo());
        stmt.setString(5, contato.getTelCelular());
        stmt.setString(6, contato.getData());
        //stmt.setTimestamp(6, timestamp);
        //Executa o codigo do sql e depois fecha
        stmt.execute();
        stmt.close();
    }

    //Método de pesquisa
    public List<Contato> getLista(String nome) throws SQLException {

        String sql = "select * from contato where nome like ?";
        PreparedStatement stmt = this.conecta.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        //Guardando contatos em minha lista
        List<Contato> myList = new ArrayList<>();

        //Enquanto existir registro no meu banco pegue o
        while (rs.next()) {

            Contato contato = new Contato();
            contato.setId(rs.getInt("id"));
            contato.setNome(rs.getString("nome"));
            contato.setDataNasc(rs.getString("data_nasc"));
            contato.setEmail(rs.getString("email"));
            contato.setTelFixo(rs.getString("telefone_fixo"));
            contato.setTelCelular(rs.getString("telefone_movel"));
          //contato.setData(rs.getString("dt_cadastro"));
            //data = rs.getTimestamp("dt_cadastro"); // funciona pq o java.sql.Timestamp é uma subclasse de java.util.Date
            myList.add(contato);
        }

        //Executa o codigo do sql e depois fecha
        stmt.execute();
        stmt.close();

        return myList;
    }

    public void exclui(Contato contato) throws SQLException {
        String sql = "delete from contato where id=?";
        PreparedStatement stmt = this.conecta.prepareStatement(sql);
        stmt.setInt(1, contato.getId());
        //Executa o codigo do sql e depois fecha
        stmt.execute();
        stmt.close();
    }

    public void alterar(Contato contato) throws SQLException {
        String sql = "update contato set nome = ? , data_nasc = ?, email = ?, telefone_fixo = ?, telefone_movel = ? where id=?";

        PreparedStatement stmt = this.conecta.prepareStatement(sql);

        //Setando os valores em suas posições
        stmt.setString(1, contato.getNome());
        stmt.setString(2, contato.getDataNasc());
        stmt.setString(3, contato.getEmail());
        stmt.setString(4, contato.getTelFixo());
        stmt.setString(5, contato.getTelCelular());
        stmt.setInt(6, contato.getId());
        //Executa o codigo do sql e depois fecha
        stmt.execute();
        stmt.close();

    }

}
