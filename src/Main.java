import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main extends JFrame{
		
    JMenuBar menuBar = new JMenuBar();
    JMenu filmes = new JMenu("Filmes");
    JMenuItem cadastrar_filme = new JMenuItem("Cadastrar");
    JMenuItem alterar_filme = new JMenuItem("Alterar");
    JMenuItem excluir_filme = new JMenuItem("Excluir");
    JMenuItem listar_filmes = new JMenuItem("Listar");
    JMenuItem buscar_filmes = new JMenuItem("Buscar");
      

    JMenu busca = new JMenu("Realizar Busca");
    JMenu sair = new JMenu("Sair");

    JLabel logo = new JLabel();
    
    JLabel aparelho1 = new JLabel("Aparelho 01");
    JLabel aparelho2 = new JLabel("Aparelho 02");
    JLabel aparelho3 = new JLabel("Aparelho 03");
    JLabel info1 = new JLabel();
    JLabel info2 = new JLabel();
    JLabel info3 = new JLabel();
    
    JButton fechar = new JButton("Iniciar Monitoramento");	
	
	
	public Main() {
		
		
		   JPanel painel = new JPanel();
	        painel.setLayout(null);
	        painel.setBackground(Color.white);
	        setTitle("Gerenciamento de Filmes  - Majuca");


	        painel.add(menuBar);
	        menuBar.setBounds(0, 0, 600, 27);
	        painel.add(fechar);
	        fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_sair(2).png")));
	        fechar.setBounds(260, 260, 45, 40);
	        fechar.addActionListener(//evento anônimo para o clique no botão
	        new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent e){//É verificado se o usuário deseja realemente sair do software
	                int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do Programa?", "Confirmação", JOptionPane.YES_NO_OPTION);
	                if (resp == JOptionPane.YES_OPTION){
	                    System.exit(0);//Caso sim, o programa será finalizado
	                }
	            
	            }
	            
	        }
	        );
	        
	        //Abaixo são inseridos os elementos do menu através a inserção no componente MenuBar, São atribuído ícones aos itens e alteradas o tamanho e fonte dos mesmos
	        menuBar.add(filmes);
	        filmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_filmes2.png")));
	        filmes.setFont(new Font("Serif", Font.BOLD, 18));

	        busca.setFont(new Font("Serif", Font.BOLD, 18));
	        filmes.setFont(new Font("Serif", Font.BOLD, 18));

	        filmes.add(cadastrar_filme);
	        cadastrar_filme.setFont(new Font("Serif", Font.BOLD, 15));
	        cadastrar_filme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_salvar.png")));
	        cadastrar_filme.addActionListener(//Evento anônimo para clique na opção "Cadastrar" do menu
	                new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    new cadastra_Filme();//É criada uma nova instancia da classe cadastrar_Filme, para a exibição da tela de cadastro
	                } catch (ParseException ex) {
	                    Logger.getLogger(Filmes.class.getName()).log(Level.SEVERE, null, ex);
	                }
	                dispose();//A tela inicial é ocultada
	            }
	        }
	        );

	        filmes.add(alterar_filme);
	        alterar_filme.setFont(new Font("Serif", Font.BOLD, 15));
	        alterar_filme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_alterar.png")));
	        alterar_filme.addActionListener(//Evento anônimo para clique na opção "Alterar" do menu
	                new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    new altera_Filme();//É criada uma nova instancia da classe altera_Filme, para que a etla de alteração seja exibida
	                } catch (ParseException ex) {
	                    Logger.getLogger(Filmes.class.getName()).log(Level.SEVERE, null, ex);
	                }
	                dispose();//A tela incial é ocultada
	            }
	        }
	        );
	        /**
	         * 
	         * O mesmo ocorre em todos os botões da menu inicial, isto é, através de eventos anônimos são criada novas instancias das classes das tela desejadas e a tela inicial é ocultada
	         */
	        filmes.add(excluir_filme);
	        excluir_filme.setFont(new Font("Serif", Font.BOLD, 15));
	        excluir_filme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_excluir.png")));
	        excluir_filme.addActionListener(
	                new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                new pesquisar_ExcluirFilme();
	                dispose();
	            }
	        }
	        );
	        
	        filmes.add(buscar_filmes);
	        buscar_filmes.setFont(new Font("Serif", Font.BOLD, 15));
	        buscar_filmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_busca.png")));  
	        buscar_filmes.addActionListener(
	        new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent e){
	                dispose();
	                new busca_Filme();
	            }
	        }
	        );

	        filmes.add(listar_filmes);
	        listar_filmes.setFont(new Font("Serif", Font.BOLD, 15));
	        listar_filmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_listar.png")));
	        listar_filmes.addActionListener(
	                new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                dispose();
	                new listar_Filmes();
	            }
	        }
	        );

	  

	        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_majuca1.jpg")));
	        painel.add(logo);
	        logo.setBounds(-10, 30, 260, 200);
	        
	  
	        
	        
	        painel.add(informacoes1);
	        informacoes1.setFont(new Font("Serif", Font.BOLD, 10));
	        informacoes1.setBounds(20, 250, 300, 23);
	        
	        painel.add(informacoes2);
	        informacoes2.setFont(new Font("Serif", Font.BOLD, 10));
	        informacoes2.setBounds(20, 265, 300, 23);
	        
	                
	        painel.add(informacoes3);
	        informacoes3.setFont(new Font("Serif", Font.BOLD, 10));
	        informacoes3.setBounds(20, 280, 300, 23);
	        
	        painel.add(informacoes4);
	        informacoes4.setFont(new Font("Serif", Font.BOLD, 10));
	        informacoes4.setBounds(20, 295, 300, 23);
	        
	        add(painel);
	        setVisible(true);
	        setSize(340, 350);
	        setLocation(440, 100);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main();
	}

}
