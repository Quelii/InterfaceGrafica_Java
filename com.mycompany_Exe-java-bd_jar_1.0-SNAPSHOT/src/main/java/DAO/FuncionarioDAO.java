
package DAO;

import DAO.ConexaoDAO;
import DAO.ConexaoDAO;
import DAO.ConexaoDAO;
import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FuncionarioDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList();
    
    public void cadastrarFuncionario(FuncionarioDTO objfuncionariodto){
        String sql = "insert into funcionarios(nome, endereco) values(?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getEndereco_funcionario());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO"+ erro);
        }
    }
    
    public ArrayList<FuncionarioDTO> PesquisarFuncionario(){
        
        String sql = "select * from funcionarios";
        conn = new ConexaoDAO().conectaBD();
        
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
                objFuncionarioDTO.setId_funcionario(rs.getInt("id"));
                objFuncionarioDTO.setNome_funcionario(rs.getString("nome"));
                objFuncionarioDTO.setEndereco_funcionario(rs.getString("endereco"));
                
                lista.add(objFuncionarioDTO);
                
            }
            
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, " FuncionarioDAO Pesquisar" + erro);

        }return lista;
    }        
    
    public void alterarFuncionario(FuncionarioDTO objfuncionariodto){
        String sql = "update funcionarios set nome=?, endereco=? where id=?";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getEndereco_funcionario());
            pstm.setInt(3, objfuncionariodto.getId_funcionario());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO"+ erro);
        }
    }
    
    
    public void excluirFuncionario(FuncionarioDTO objfuncionariodto){
        String sql = "delete from funcionarios where id = ?";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objfuncionariodto.getId_funcionario());

            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO"+ erro);
        }
    }
   
}
