/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsacw;
import javax.swing.*;
/**
 *
 * @author Dinesha
 */
public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    QueueC object = null;
    SqlConnection sqlcon =null;
    int tokenNo = 0;
    int printToken;
public String loopC;
public String data[][] = {{"1","Rice","Rs.10","100g"},{"2","Sugar","Rs.65","100g"},
{"3","Dhal","Rs.50","100g"},{"4","Biscuite","Rs.100","1"},{"5","Onion","Rs.22","100g"},
{"6","Coconut","Rs.85","1"},{"7","Salmon","Rs.360","1"},{"8","Leeks","Rs.60","100g"},};
public String [] column = {"Product Id", "Product Name", "Price","Unit"};


    public Homepage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        setTitle("Homepage");
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblcashiername = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        txtcashiename = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        cbRice = new javax.swing.JCheckBox();
        cbDhal = new javax.swing.JCheckBox();
        cbSuger = new javax.swing.JCheckBox();
        cbBiscute = new javax.swing.JCheckBox();
        cbOnion = new javax.swing.JCheckBox();
        cbCoconut = new javax.swing.JCheckBox();
        cbApple = new javax.swing.JCheckBox();
        cbOrange = new javax.swing.JCheckBox();
        lblsubtotal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        lblPayment = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        txtDiscount = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtPayment = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableproDetails = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtRice = new javax.swing.JTextField();
        txtDhal = new javax.swing.JTextField();
        txtSuger = new javax.swing.JTextField();
        txtOnion = new javax.swing.JTextField();
        txtCocount = new javax.swing.JTextField();
        txtApple = new javax.swing.JTextField();
        txtOrange = new javax.swing.JTextField();
        txtBiscute = new javax.swing.JTextField();
        lblTokenNo = new javax.swing.JLabel();
        txtTokenNo = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdsacw/receipt.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel3.setText("Payment recipt");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDate.setText("Customer Count :");

        lblcashiername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcashiername.setText("Cashier name :");

        jTextField3.setText("jTextField3");

        cbRice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbRice.setText("Rice (g)");

        cbDhal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbDhal.setText("Dhal (g)");

        cbSuger.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbSuger.setText("Sugar (g)");

        cbBiscute.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbBiscute.setText("Biscute");
        

        cbOnion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbOnion.setText("Onion (g)");

        cbCoconut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbCoconut.setText("Coconut");

        cbApple.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbApple.setText("Salmon");
        

        cbOrange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbOrange.setText("Leeks");

        lblsubtotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsubtotal.setText("Total (Rs)");

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotal.setText("Payable (Rs)");

        lblDiscount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDiscount.setText("Discount");

        lblPayment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPayment.setText("Payment (Rs)");

        lblBalance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBalance.setText("Balance (Rs)");

        tableproDetails.setModel(new javax.swing.table.DefaultTableModel(
            data,column
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableproDetails);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdsacw/floppy-disk.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdsacw/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });


        btnClose.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdsacw/close Jframe.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lblTokenNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTokenNo.setText("Token No");

        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalculate.setText("$ Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdsacw/bill.png"))); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbDhal)
                    .addComponent(cbRice)
                    .addComponent(cbSuger, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBiscute, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBiscute, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtRice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDhal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSuger, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOnion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCoconut)
                    .addComponent(cbApple, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOrange))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtOnion)
                        .addComponent(txtCocount)
                        .addComponent(txtApple, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtOrange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblsubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDiscount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPayment)
                        .addComponent(lblBalance)
                        .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsubtotal)
                    .addComponent(txtDiscount)
                    .addComponent(txtTotal)
                    .addComponent(txtPayment)
                    .addComponent(txtBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(217, 217, 217))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset)
                            .addComponent(btnClose))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcashiername)
                            .addComponent(lblDate)
                            .addComponent(lblTokenNo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcashiename, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(txtTokenNo))
                                .addGap(6, 6, 6)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcashiename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcashiername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTokenNo)
                            .addComponent(txtTokenNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)))
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(lblDiscount)
                                        .addGap(14, 14, 14)
                                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(lblPayment))
                                    .addComponent(lblsubtotal))
                                .addGap(24, 24, 24)
                                .addComponent(lblBalance))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbOnion)
                                .addGap(16, 16, 16)
                                .addComponent(cbCoconut)
                                .addGap(18, 18, 18)
                                .addComponent(cbApple)
                                .addGap(18, 18, 18)
                                .addComponent(cbOrange))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbRice)
                                    .addComponent(txtRice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbDhal)
                                    .addComponent(txtDhal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSuger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSuger))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbBiscute)
                                    .addComponent(txtBiscute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOnion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtCocount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(txtApple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(txtOrange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset)
                            .addComponent(btnCalculate))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void queueObjectCreater(int obj){
object = new QueueC(obj);
}

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBiscuteActionPerformed
        // TODO add your handling code here:Reset
        txtdate.setText("");//Date
        txtcashiename.setText("");//Cashier Name
        txtTokenNo.setText("");//Token Number
        txtsubtotal.setText("");//Sub Total
        txtDiscount.setText("");//Discount
        txtTotal.setText("");//Total
        txtPayment.setText("");//Payment
        txtBalance.setText("");//Balance
        
        txtRice.setText("");//Rice
        txtSuger.setText("");//Sugar
        txtBiscute.setText("");//Biscuite
        txtDhal.setText("");///Dhal
        txtOnion.setText("");//Onion
        txtCocount.setText("");//Coconut
        txtApple.setText("");//Apple
        txtOrange.setText("");//Orange

        cbRice.setSelected(false);//Rice
        cbDhal.setSelected(false);//Dhal
        cbSuger.setSelected(false);//Sugar
        cbBiscute.setSelected(false);//Biscuite
        cbOnion.setSelected(false);//Onion
        cbCoconut.setSelected(false);//Coconut
        cbApple.setSelected(false);//Apple
        cbOrange.setSelected(false);//Orange

        
    }//GEN-LAST:event_cbBiscuteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
try{
    if((txtdate.getText()=="")||(Integer.parseInt(txtdate.getText())==0)||(txtTokenNo.getText()=="")||(Integer.parseInt(txtTokenNo.getText())==0)){
        JOptionPane.showMessageDialog(null, "Customer Count or Token Number Can not be Empty !");
        
    }else{
        if(object == null){
            queueObjectCreater(Integer.parseInt(txtdate.getText()));
            JOptionPane.showMessageDialog(null, "Customer count entered successfully !");
        }
    
        object.enqueue(Integer.parseInt(txtTokenNo.getText()));
        object.peekFront();
    }
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, "Customer Count or Token Number Can not be Empty !");
}
    }//GEN-LAST:event_btnSaveActionPerformed

   /*  public void fetchTableData(Homepage hmR){
    //sqlcon.recieveHMObject(hmR);
    }*/

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(sqlcon!=null){sqlcon.cleanUp();}
        System.exit(0);
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
try{
    sqlcon = new SqlConnection();
    sqlcon.dbConnect();
    int frntVal = object.dequeue();
    printToken = frntVal;

if(object!=null){
    if(frntVal!=-999){
        if((cbRice.isSelected()==true)&&(txtRice.getText()!=""))
        {
            sqlcon.setSql("INSERT INTO `orders`(`Token_Id`, `Product_Id`, `Quantity`) VALUES ('"+frntVal+"','1','"+Integer.parseInt(txtRice.getText())+"')");
            
        }
        if((cbSuger.isSelected()==true)&&(txtSuger.getText()!=""))
        {
            sqlcon.setSql("INSERT INTO `orders`(`Token_Id`, `Product_Id`, `Quantity`) VALUES ('"+frntVal+"','2','"+Integer.parseInt(txtSuger.getText())+"')");
            
        }
        if((cbDhal.isSelected()==true)&&(txtDhal.getText()!=""))
        {
            sqlcon.setSql("INSERT INTO `orders`(`Token_Id`, `Product_Id`, `Quantity`) VALUES ('"+frntVal+"','3','"+Integer.parseInt(txtDhal.getText())+"')");
            
        }
        if((cbBiscute.isSelected()==true)&&(txtBiscute.getText()!=""))
        {
            sqlcon.setSql("INSERT INTO `orders`(`Token_Id`, `Product_Id`, `Quantity`) VALUES ('"+frntVal+"','4','"+Integer.parseInt(txtBiscute.getText())+"')");
            
        }
        if((cbOnion.isSelected()==true)&&(txtOnion.getText()!=""))
        {
            sqlcon.setSql("INSERT INTO `orders`(`Token_Id`, `Product_Id`, `Quantity`) VALUES ('"+frntVal+"','5','"+Integer.parseInt(txtOnion.getText())+"')");
            
        }
        if((cbCoconut.isSelected()==true)&&(txtCocount.getText()!=""))
        {
            sqlcon.setSql("INSERT INTO `orders`(`Token_Id`, `Product_Id`, `Quantity`) VALUES ('"+frntVal+"','6','"+Integer.parseInt(txtCocount.getText())+"')");
            
        }
        if((cbApple.isSelected()==true)&&(txtApple.getText()!=""))
        {
            sqlcon.setSql("INSERT INTO `orders`(`Token_Id`, `Product_Id`, `Quantity`) VALUES ('"+frntVal+"','7','"+Integer.parseInt(txtApple.getText())+"')");
            
        }
        if((cbOrange.isSelected()==true)&&(txtOrange.getText()!=""))
        {
            sqlcon.setSql("INSERT INTO `orders`(`Token_Id`, `Product_Id`, `Quantity`) VALUES ('"+frntVal+"','8','"+Integer.parseInt(txtOrange.getText())+"')");
            
        }//
        sqlcon.fetchData("SELECT * FROM `orders` WHERE `Token_Id` = '"+frntVal+"' ");
        JOptionPane.showMessageDialog(null,"Bill Calculated Successfully !");
        
//


//
        txtsubtotal.setText(String.valueOf(sqlcon.subT));
        
        
    }else{
        JOptionPane.showMessageDialog(null,"All the entered token numbers have beeen used, Enter next customer count and token list !");
        object = null;
    } 
    
}
else{
    JOptionPane.showMessageDialog(null,"Try after entering customer count and token numbers !");
}
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,"Try after entering customer count and token numbers !");
}
 
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

try{
if((txtDiscount.getText()=="")||(txtPayment.getText()=="")){
    JOptionPane.showMessageDialog(null,"Set a discount and the payment.(if there is no discount enter 0.)");
}

if((txtDiscount.getText()!="")&&(txtPayment.getText()!="")){
    String cashierName = txtcashiename.getText();
    sqlcon.printBill(Integer.parseInt(txtDiscount.getText()), Integer.parseInt(txtPayment.getText()),cashierName);
    txtTotal.setText(String.valueOf(sqlcon.payable));

    //txtBalance.setText(String.valueOf(sqlcon.balance));
    JOptionPane.showMessageDialog(null,":: DA Super store :: \n\nBill:"+"Customer :"+printToken+"\n\n"+"Your balance is Rs: "+sqlcon.balance+".00\n\n"+"Thank you for doing bussiness with us !");
}else{
    JOptionPane.showMessageDialog(null,"Set a discount and the payment.(if there is no discount enter 0.)");
}

}
catch(Exception e){
    System.out.println(e);
}

        
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox cbApple;
    private javax.swing.JCheckBox cbBiscute;
    private javax.swing.JCheckBox cbCoconut;
    private javax.swing.JCheckBox cbDhal;
    private javax.swing.JCheckBox cbOnion;
    private javax.swing.JCheckBox cbOrange;
    private javax.swing.JCheckBox cbRice;
    private javax.swing.JCheckBox cbSuger;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblPayment;
    private javax.swing.JLabel lblTokenNo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblcashiername;
    private javax.swing.JLabel lblsubtotal;
    private javax.swing.JTable tableproDetails;
    private javax.swing.JTextField txtApple;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBiscute;
    private javax.swing.JTextField txtCocount;
    private javax.swing.JTextField txtDhal;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtOnion;
    private javax.swing.JTextField txtOrange;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtRice;
    private javax.swing.JTextField txtSuger;
    private javax.swing.JTextField txtTokenNo;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtcashiename;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtsubtotal;
    // End of variables declaration//GEN-END:variables
}
