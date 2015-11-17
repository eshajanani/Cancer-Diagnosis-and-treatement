
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;
import java.io.InputStream;
import java.util.ArrayList;
import static com.hp.hpl.jena.assembler.JA.Model;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.util.FileManager;
import java.io.InputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Janani
 */
public class Test_ResultPage extends javax.swing.JFrame {

       ArrayList<String> tests_list = new ArrayList<String>();
       ArrayList<String> test_taken_pos = new ArrayList<String>();
        ArrayList<String> cancer_test_pos = new ArrayList<String>();
	ArrayList<String> final_cancer_list= new ArrayList<String>();
         ArrayList<String> common_cancer= new ArrayList<String>();
    /**
     * Creates new form Test_ResultPage
     */
    public Test_ResultPage(ArrayList<String> test_list,ArrayList<String> com_cancer ) {
        initComponents();
         this.tests_list =test_list;
         this.common_cancer=com_cancer;
        System.out.println("test list in test result  page :" + this.tests_list );
        System.out.println("common cancer test result  page :" + this.common_cancer );
        
    }
    public Test_ResultPage() {
     
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TestTxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Cancer Diagonsis and Treatment");
        jLabel1.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Enter the test taken and which were postivie in result");

        SubmitBtn.setText("Submit to check your result");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        TestTxt.setColumns(20);
        TestTxt.setRows(5);
        jScrollPane1.setViewportView(TestTxt);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed

        // TODO add your handling code here:
        testQueryProcess();
        this.setVisible(false);
        new Diagnosis(cancer_test_pos).setVisible(true);
        new Drugs_ListPage().setVisible(false);
        new Habits_CheckPage().setVisible(false);
        new CurrentLocation().setVisible(false);
        new Route_ExitPage().setVisible(false);
    //    new TestCheckPage().setVisible(false);
        new Test_SuggestionPage().setVisible(false);
        new Test_ResultPage().setVisible(false);
        
        
        
    }//GEN-LAST:event_SubmitBtnActionPerformed

    
     public void testQueryProcess()
    {
    String TestList = TestTxt.getText();
     //   System.out.println("Concerns are :" +concernList); 
        String test[] = TestList.split(",");
        for(int i=0;i<test.length;i++)
       {
           test[i]=test[i].replace(" ","_");
       }
        for(int i=0;i<test.length;i++)
       {
           test_taken_pos.add(test[i]);
       }
         Model model = ModelFactory.createDefaultModel();
			InputStream in = FileManager.get().open( "cancer_rdf.owl" );
			if (in == null) {
			    throw new IllegalArgumentException("File: not found");
			}

			// read the RDF/XML file
			model.read(in, null);
        for(int j=0;j<common_cancer.size();j++)
			{
				ArrayList<String> test_list= new ArrayList<String>();
				String can_name= common_cancer.get(j);
				issueSPARQLTestsForCancerType(model,can_name,test_list,common_cancer);
				System.out.println("Test list for " +can_name+" is: " + test_list);
				int flag=0;
			for(int i=0;i< test_taken_pos.size();i++)
			{
			String test_pos= test_taken_pos.get(i);
			
		//	issueSPARQLTestPos(model,test_pos,cancer_test_pos,common_cancer);
			
			if(test_list.contains(test_pos))
			{
				flag=1;
			}
			else
				{
				flag=0;
				break;
				}
			
			
			}
			if(flag==1)
			{
				cancer_test_pos.add(can_name);
			}
			
			
			}
			System.out.println("Final cancer list: " + cancer_test_pos);

        
        model.close();
    }
    
    // method to get tests name given cancer list
			 public static void issueSPARQLTestsForCancerType(Model m, String can_name, ArrayList<String> t_list, ArrayList<String> common_cancer)
				{
				 			 
				 /****************************************Getting test name type by cancer name*********************************************************/
					String causes_val=can_name;
				//	String drug="HPV";
					String defaultNameSpace = "http://www.semanticweb.org/janani/ontologies/2015/3/cancer-treatment#";
					String willCauseNameSpace="<http://www.semanticweb.org/janani/ontologies/2015/3/cancer-treatment#hasTests>";
					String ntemp1="<"+defaultNameSpace+causes_val+">";
					String temp1="";


					//temp1 =temp1+causes+" "+"?p"+" " +"?Disease " + " ." ;
					temp1= temp1+ntemp1+" "+willCauseNameSpace+" ?tests";
					String queryStringDrug = 
							"SELECT   ?tests "+
									"WHERE {"+ temp1 +
									"   }";


					System.out.println(queryStringDrug);

					Query query1 = QueryFactory.create(queryStringDrug);
					
					
					QueryExecution qe1 = QueryExecutionFactory.create(query1, m);

					ResultSet results1 = qe1.execSelect();
									
				//	ResultSetFormatter.out(System.out, results1, query1);
					
					RDFNode test_name;
					
					while( results1.hasNext() ) 
					{
						String[] t_name;
						 QuerySolution querySolution = results1.next();
						 test_name=querySolution.get("tests");
						 String temp_val =String.valueOf(test_name);
						 t_name= temp_val.split("#");
						 if(!t_list.contains(t_name[1]))
						 {
							 t_list.add(t_name[1]);
						 }
						 
					}
				}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test_ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test_ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test_ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test_ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test_ResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextArea TestTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}