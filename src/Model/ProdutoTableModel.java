package Model;

import DAO.ProdutoDAO;
import Objetos.OProduto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel extends AbstractTableModel{

    private final String[] colunas = {"Nome","Imagem","Quantidade","Fornecedor","Valor","Data de Entrada"};
    private final List<OProduto> dados = new ArrayList<>();
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getNimg();  
            case 2:
                return dados.get(linha).getQtde();
            case 3:
                return dados.get(linha).getFornecedor();
            case 4:
                return dados.get(linha).getValor();
            case 5:
                return dados.get(linha).getData();
        }
        
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna){
            case 0:
                dados.get(linha).setNome((String) valor);
                break;
            case 1:
                dados.get(linha).setNimg((String) valor);
                break;
            case 2:
                dados.get(linha).setQtde(Integer.parseInt((String) valor));
                break;
            case 3:
                dados.get(linha).setFornecedor((String) valor);
                break;
            case 4:
                dados.get(linha).setValor(Double.parseDouble((String) valor));
                break;
            case 5:
                dados.get(linha).setData((String) valor);
                break;
        }
    }
    
    public void addLinha(OProduto p) {        
        this.dados.add(p);
        this.fireTableDataChanged();
    }

    public void removeLinha(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public OProduto PegaDadosLinha(int linha){
        return dados.get(linha);
    }
    
    public void LerDados(){
        
        ProdutoDAO pdao = new ProdutoDAO();
        
        for (OProduto p: pdao.read()) {
            this.addLinha(p);
        }
        
        this.fireTableDataChanged();
        
    }
    
    public void Search(String valor){
        
        this.dados.clear();
        ProdutoDAO pdao = new ProdutoDAO();
        
        for (OProduto p: pdao.Search(valor)) {
            this.addLinha(p);
        }
        
        this.fireTableDataChanged();
        
    }
    
    public void RecarregaTabela(){
        this.dados.clear();
        LerDados();
        this.fireTableDataChanged();
    }
    
    public List<OProduto> RetornaArray(){
        return dados;
    }
    
}
