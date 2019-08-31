package DAO;

import Conexão.ConexaoSQL;
import Objetos.OProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class ProdutoDAO {
    
    public static String alert = "";
    static Logger logger = Logger.getLogger("file");
    
    public void Create(OProduto p){
        
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO tbl_produto (Nome,Imagem,NImg,Qtde,Fornecedor,Valor,Data) VALUES (?,?,?,?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setBytes(2, p.getImg());
            stmt.setString(3, p.getNimg());
            stmt.setInt(4, p.getQtde());
            stmt.setString(5, p.getFornecedor());
            stmt.setDouble(6, p.getValor());
            stmt.setString(7, p.getData());
            if (stmt.execute()) {
                this.alert = "Falha ao Inserir!";
            } else {
                this.alert = "Inserido com Sucesso!";
            }
        } catch (SQLException e) {
            logger.error(e);
            JOptionPane.showMessageDialog(null, "Erro ao registrar informações: ","Atenção",JOptionPane.ERROR_MESSAGE);
        } finally {
            ConexaoSQL.CloseConnection(con, stmt);
        }
    }
    
    public List<OProduto> read() {
        
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<OProduto> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_produto");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                OProduto p = new OProduto();
                p.setCod_prod(rs.getInt("Cod_Prod"));
                p.setNome(rs.getString("Nome"));
                p.setImg(rs.getBytes("Imagem"));
                p.setQtde(rs.getInt("Qtde"));
                p.setFornecedor(rs.getString("Fornecedor"));
                p.setValor(rs.getDouble("Valor"));
                produtos.add(p);
            }
            
        } catch (SQLException e) {
            logger.error(e);
            JOptionPane.showMessageDialog(null, "Erro ao obter registros do BD: ","Atenção",JOptionPane.ERROR_MESSAGE);
        } finally {
            ConexaoSQL.CloseConnection(con, stmt, rs);
        }
        
        return produtos;    
    }
    
    public void Update(OProduto p){
    
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE tbl_produto SET Nome = ?, Imagem = ?, Qtde = ?, Fornecedor = ?, Valor = ? WHERE Cod_Prod = ?");
            stmt.setString(1, p.getNome());
            stmt.setBytes(2, p.getImg());
            stmt.setInt(3, p.getQtde());
            stmt.setString(4, p.getFornecedor());
            stmt.setDouble(5, p.getValor());
            stmt.setInt(6, p.getCod_prod());
            if (stmt.execute()) {
                this.alert = "Falha ao Atualizar!";
            } else {
                this.alert = "Atualizado com Sucesso!";
            }
        } catch (SQLException e) {
            logger.error(e);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro: ","Atenção",JOptionPane.ERROR_MESSAGE);
        } finally {
            ConexaoSQL.CloseConnection(con, stmt);
        }
        
    }
    
    public void Delete(int id){
    
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM tbl_produto WHERE Cod_Prod = ?");
            stmt.setInt(1, id);
            if (stmt.execute()) {
                this.alert = "Falha ao Excluir!";
            } else {
                this.alert = "Excluido com Sucesso!";
            }
        } catch (SQLException e) {
            logger.error(e);
            JOptionPane.showMessageDialog(null, "Erro ao deletar o registro: ","Atenção",JOptionPane.ERROR_MESSAGE);
        } finally {
            ConexaoSQL.CloseConnection(con, stmt);
        }
        
    }
    
    public List<OProduto> Search(String valor){
        
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<OProduto> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_produto WHERE Nome LIKE ?");
            stmt.setString(1, "%"+valor+"%");
            rs = stmt.executeQuery();
              if(rs.next()){
                  do{                      
                    OProduto p = new OProduto();
                    p.setCod_prod(rs.getInt("Cod_Prod"));
                    p.setNome(rs.getString("Nome"));
                    p.setImg(rs.getBytes("Imagem"));
                    p.setQtde(rs.getInt("Qtde"));
                    p.setFornecedor(rs.getString("Fornecedor"));
                    p.setValor(rs.getDouble("Valor"));
                    produtos.add(p);
                  }while (rs.next());
              }else{
                JOptionPane.showMessageDialog(null, "Cadastro Não Encontrado","Atenção",JOptionPane.ERROR_MESSAGE);
              }
        } catch (SQLException e) {
            logger.error(e);
            JOptionPane.showMessageDialog(null, "Erro ao obter registros do BD: ","Atenção",JOptionPane.ERROR_MESSAGE);
        } finally {
            ConexaoSQL.CloseConnection(con, stmt, rs);
        }
        
        return produtos;
    }
    
}
