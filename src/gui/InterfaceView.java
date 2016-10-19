/*
 * InterfaceView.java
 */

package gui;

import org.jdesktop.application.Action;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import entradaSaida.*;
import grafo.*;
import bellmanford.*;

/**
 * Desenha a interface do programa que implementa o algoritmo de Bellman-Ford
 * @author Joao Daher
 */

public class InterfaceView extends FrameView {
    /**
     * Contrutor da classe
     * @param app
     */
    public InterfaceView(SingleFrameApplication app) {
        super(app);
        initComponents();
    }

    /**
     * Método publico que exibe uma janela com informacoes sobre
     * o programa e seus desenvolvedores
     */
    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = Interface.getApplication().getMainFrame();
            aboutBox = new InterfaceAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        Interface.getApplication().show(aboutBox);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        GraphPanel = new javax.swing.JPanel();
        GraphLabel1 = new javax.swing.JLabel();
        GraphTextArea = new javax.swing.JTextField();
        GraphLabel2 = new javax.swing.JLabel();
        GraphSelectionButtom = new javax.swing.JLabel();
        GraphInfoButtom = new javax.swing.JLabel();
        GraphChoice1 = new javax.swing.JRadioButton();
        GraphChoice2 = new javax.swing.JRadioButton();
        GraphLabel3 = new javax.swing.JLabel();
        GraphCheckButtom = new javax.swing.JButton();
        GraphCancelButtom = new javax.swing.JButton();
        SourcePanel = new javax.swing.JPanel();
        SourceOptions = new javax.swing.JComboBox();
        SourceLabel1 = new javax.swing.JLabel();
        SourceLabel2 = new javax.swing.JLabel();
        SourceField = new javax.swing.JTextField();
        SourceInfoButtom = new javax.swing.JLabel();
        SourceCancelButtom = new javax.swing.JButton();
        SourceCheckButtom = new javax.swing.JButton();
        AlgorithmPanel = new javax.swing.JPanel();
        AlgorithmButtom = new javax.swing.JButton();
        AlgorithmLabel1 = new javax.swing.JLabel();
        AlgorithmLabel2 = new javax.swing.JLabel();
        DetailButtom = new javax.swing.JButton();
        RestartButtom = new javax.swing.JButton();
        AlgorithmLabel3 = new javax.swing.JLabel();
        AlgorithmInfoButtom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
        InfoFrame = new javax.swing.JFrame();
        InfoLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InfoTextArea = new javax.swing.JTextPane();
        ResultFrame = new javax.swing.JFrame();
        ResultLabel = new javax.swing.JLabel();
        ResultIcon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultTextArea = new javax.swing.JTextPane();

        mainPanel.setName("mainPanel"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gui.Interface.class).getContext().getResourceMap(InterfaceView.class);
        GraphPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("GraphPanel.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("GraphPanel.border.titleFont"))); // NOI18N
        GraphPanel.setName("GraphPanel"); // NOI18N

        GraphLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GraphLabel1.setText(resourceMap.getString("GraphLabel1.text")); // NOI18N
        GraphLabel1.setName("GraphLabel1"); // NOI18N

        GraphTextArea.setText(resourceMap.getString("GraphTextArea.text")); // NOI18N
        GraphTextArea.setName("GraphTextArea"); // NOI18N

        GraphLabel2.setText(resourceMap.getString("GraphLabel2.text")); // NOI18N
        GraphLabel2.setName("GraphLabel2"); // NOI18N

        GraphSelectionButtom.setIcon(resourceMap.getIcon("GraphSelectionButtom.icon")); // NOI18N
        GraphSelectionButtom.setText(resourceMap.getString("GraphSelectionButtom.text")); // NOI18N
        GraphSelectionButtom.setName("GraphSelectionButtom"); // NOI18N
        GraphSelectionButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GraphSelectionButtomMouseReleased(evt);
            }
        });

        GraphInfoButtom.setIcon(resourceMap.getIcon("GraphInfoButtom.icon")); // NOI18N
        GraphInfoButtom.setText(resourceMap.getString("GraphInfoButtom.text")); // NOI18N
        GraphInfoButtom.setName("GraphInfoButtom"); // NOI18N
        GraphInfoButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GraphInfoButtomMouseReleased(evt);
            }
        });

        GraphChoice1.setText(resourceMap.getString("GraphChoice1.text")); // NOI18N
        GraphChoice1.setName("GraphChoice1"); // NOI18N
        firstChoice=true;
        GraphChoice1.doClick();
        GraphSelectionButtom.setEnabled(false);
        GraphChoice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GraphChoice1MouseReleased(evt);
            }
        });

        GraphChoice2.setText(resourceMap.getString("GraphChoice2.text")); // NOI18N
        GraphChoice2.setName("GraphChoice2"); // NOI18N
        GraphChoice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GraphChoice2MouseReleased(evt);
            }
        });

        GraphLabel3.setText(resourceMap.getString("GraphLabel3.text")); // NOI18N
        GraphLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GraphLabel3.setName("GraphLabel3"); // NOI18N

        GraphCheckButtom.setFont(resourceMap.getFont("GraphCheckButtom.font")); // NOI18N
        GraphCheckButtom.setForeground(resourceMap.getColor("GraphCheckButtom.foreground")); // NOI18N
        GraphCheckButtom.setIcon(resourceMap.getIcon("GraphCheckButtom.icon")); // NOI18N
        GraphCheckButtom.setText(resourceMap.getString("GraphCheckButtom.text")); // NOI18N
        GraphCheckButtom.setName("GraphCheckButtom"); // NOI18N
        GraphCheckButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GraphCheckButtomMouseReleased(evt);
            }
        });

        GraphCancelButtom.setFont(resourceMap.getFont("GraphCancelButtom.font")); // NOI18N
        GraphCancelButtom.setForeground(resourceMap.getColor("GraphCancelButtom.foreground")); // NOI18N
        GraphCancelButtom.setIcon(resourceMap.getIcon("GraphCancelButtom.icon")); // NOI18N
        GraphCancelButtom.setText(resourceMap.getString("GraphCancelButtom.text")); // NOI18N
        GraphCancelButtom.setName("GraphCancelButtom"); // NOI18N
        GraphCancelButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GraphCancelButtomMouseReleased(evt);
            }
        });

        org.jdesktop.layout.GroupLayout GraphPanelLayout = new org.jdesktop.layout.GroupLayout(GraphPanel);
        GraphPanel.setLayout(GraphPanelLayout);
        GraphPanelLayout.setHorizontalGroup(
            GraphPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(GraphPanelLayout.createSequentialGroup()
                .add(GraphPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(GraphChoice2)
                    .add(GraphPanelLayout.createSequentialGroup()
                        .add(GraphPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, GraphLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, GraphChoice1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 83, Short.MAX_VALUE)
                        .add(GraphInfoButtom))
                    .add(GraphPanelLayout.createSequentialGroup()
                        .add(13, 13, 13)
                        .add(GraphPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, GraphTextArea, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 269, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, GraphPanelLayout.createSequentialGroup()
                                .add(GraphSelectionButtom)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(GraphPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(GraphPanelLayout.createSequentialGroup()
                                        .add(GraphCancelButtom)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(GraphCheckButtom))
                                    .add(GraphLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(GraphLabel2)))
                .addContainerGap())
        );
        GraphPanelLayout.setVerticalGroup(
            GraphPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(GraphPanelLayout.createSequentialGroup()
                .add(GraphPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(GraphLabel1)
                    .add(GraphInfoButtom))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(GraphChoice1)
                .add(8, 8, 8)
                .add(GraphPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(GraphTextArea, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(GraphLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(GraphChoice2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(GraphPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(GraphSelectionButtom)
                    .add(GraphLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 19, Short.MAX_VALUE)
                .add(GraphPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(GraphCancelButtom)
                    .add(GraphCheckButtom))
                .add(11, 11, 11))
        );

        SourcePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("SourcePanel.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("SourcePanel.border.titleFont"))); // NOI18N
        SourcePanel.setName("SourcePanel"); // NOI18N

        SourceOptions.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SourceOptions.setEnabled(false);
        SourceOptions.setName("SourceOptions"); // NOI18N

        SourceLabel1.setText(resourceMap.getString("SourceLabel1.text")); // NOI18N
        SourceLabel1.setName("SourceLabel1"); // NOI18N

        SourceLabel2.setText(resourceMap.getString("SourceLabel2.text")); // NOI18N
        SourceLabel2.setName("SourceLabel2"); // NOI18N

        SourceField.setText(resourceMap.getString("SourceField.text")); // NOI18N
        SourceField.setEnabled(false);
        SourceField.setName("SourceField"); // NOI18N
        SourceField.setText("");
        SourceField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SourceFieldKeyReleased(evt);
            }
        });

        SourceInfoButtom.setIcon(resourceMap.getIcon("SourceInfoButtom.icon")); // NOI18N
        SourceInfoButtom.setName("SourceInfoButtom"); // NOI18N
        SourceInfoButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SourceInfoButtomMouseReleased(evt);
            }
        });

        SourceCancelButtom.setFont(resourceMap.getFont("SourceCancelButtom.font")); // NOI18N
        SourceCancelButtom.setForeground(resourceMap.getColor("SourceCancelButtom.foreground")); // NOI18N
        SourceCancelButtom.setIcon(resourceMap.getIcon("SourceCancelButtom.icon")); // NOI18N
        SourceCancelButtom.setText(resourceMap.getString("SourceCancelButtom.text")); // NOI18N
        SourceCancelButtom.setEnabled(false);
        SourceCancelButtom.setName("SourceCancelButtom"); // NOI18N
        SourceCancelButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SourceCancelButtomMouseReleased(evt);
            }
        });

        SourceCheckButtom.setFont(resourceMap.getFont("SourceCheckButtom.font")); // NOI18N
        SourceCheckButtom.setForeground(resourceMap.getColor("SourceCheckButtom.foreground")); // NOI18N
        SourceCheckButtom.setIcon(resourceMap.getIcon("SourceCheckButtom.icon")); // NOI18N
        SourceCheckButtom.setText(resourceMap.getString("SourceCheckButtom.text")); // NOI18N
        SourceCheckButtom.setEnabled(false);
        SourceCheckButtom.setName("SourceCheckButtom"); // NOI18N
        SourceCheckButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SourceCheckButtomMouseReleased(evt);
            }
        });

        org.jdesktop.layout.GroupLayout SourcePanelLayout = new org.jdesktop.layout.GroupLayout(SourcePanel);
        SourcePanel.setLayout(SourcePanelLayout);
        SourcePanelLayout.setHorizontalGroup(
            SourcePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(SourcePanelLayout.createSequentialGroup()
                .add(SourcePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(SourcePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(SourcePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(SourcePanelLayout.createSequentialGroup()
                                .add(SourceOptions, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(SourceLabel2)
                                .add(18, 18, 18)
                                .add(SourceField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, SourcePanelLayout.createSequentialGroup()
                                .add(SourceLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                .add(65, 65, 65)
                                .add(SourceInfoButtom))))
                    .add(SourcePanelLayout.createSequentialGroup()
                        .add(50, 50, 50)
                        .add(SourceCancelButtom)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(SourceCheckButtom)))
                .addContainerGap())
        );
        SourcePanelLayout.setVerticalGroup(
            SourcePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(SourcePanelLayout.createSequentialGroup()
                .add(SourcePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(SourceLabel1)
                    .add(SourceInfoButtom))
                .add(19, 19, 19)
                .add(SourcePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(SourceOptions, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(SourceLabel2)
                    .add(SourceField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 45, Short.MAX_VALUE)
                .add(SourcePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(SourceCancelButtom)
                    .add(SourceCheckButtom))
                .addContainerGap())
        );

        AlgorithmPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("AlgorithmPanel.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("AlgorithmPanel.border.titleFont"))); // NOI18N
        AlgorithmPanel.setName("AlgorithmPanel"); // NOI18N

        AlgorithmButtom.setFont(resourceMap.getFont("AlgorithmButtom.font")); // NOI18N
        AlgorithmButtom.setIcon(resourceMap.getIcon("AlgorithmButtom.icon")); // NOI18N
        AlgorithmButtom.setText(resourceMap.getString("AlgorithmButtom.text")); // NOI18N
        AlgorithmButtom.setEnabled(false);
        AlgorithmButtom.setName("AlgorithmButtom"); // NOI18N
        AlgorithmButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AlgorithmButtomMousePressed(evt);
            }
        });

        AlgorithmLabel1.setFont(resourceMap.getFont("AlgorithmLabel1.font")); // NOI18N
        AlgorithmLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlgorithmLabel1.setText(resourceMap.getString("AlgorithmLabel1.text")); // NOI18N
        AlgorithmLabel1.setName("AlgorithmLabel1"); // NOI18N

        AlgorithmLabel2.setFont(resourceMap.getFont("AlgorithmLabel2.font")); // NOI18N
        AlgorithmLabel2.setText(resourceMap.getString("AlgorithmLabel2.text")); // NOI18N
        AlgorithmLabel2.setName("AlgorithmLabel2"); // NOI18N

        DetailButtom.setBackground(resourceMap.getColor("DetailButtom.background")); // NOI18N
        DetailButtom.setFont(resourceMap.getFont("DetailButtom.font")); // NOI18N
        DetailButtom.setForeground(resourceMap.getColor("DetailButtom.foreground")); // NOI18N
        DetailButtom.setIcon(resourceMap.getIcon("DetailButtom.icon")); // NOI18N
        DetailButtom.setText(resourceMap.getString("DetailButtom.text")); // NOI18N
        DetailButtom.setBorderPainted(false);
        DetailButtom.setEnabled(false);
        DetailButtom.setName("DetailButtom"); // NOI18N
        DetailButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DetailButtomMouseReleased(evt);
            }
        });

        RestartButtom.setFont(resourceMap.getFont("RestartButtom.font")); // NOI18N
        RestartButtom.setForeground(resourceMap.getColor("RestartButtom.foreground")); // NOI18N
        RestartButtom.setIcon(resourceMap.getIcon("RestartButtom.icon")); // NOI18N
        RestartButtom.setText(resourceMap.getString("RestartButtom.text")); // NOI18N
        RestartButtom.setName("RestartButtom"); // NOI18N
        RestartButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RestartButtomMouseReleased(evt);
            }
        });

        AlgorithmLabel3.setFont(resourceMap.getFont("AlgorithmLabel3.font")); // NOI18N
        AlgorithmLabel3.setText(resourceMap.getString("AlgorithmLabel3.text")); // NOI18N
        AlgorithmLabel3.setName("AlgorithmLabel3"); // NOI18N

        AlgorithmInfoButtom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlgorithmInfoButtom.setIcon(resourceMap.getIcon("AlgorithmInfoButtom.icon")); // NOI18N
        AlgorithmInfoButtom.setName("AlgorithmInfoButtom"); // NOI18N
        AlgorithmInfoButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AlgorithmInfoButtomMouseReleased(evt);
            }
        });

        org.jdesktop.layout.GroupLayout AlgorithmPanelLayout = new org.jdesktop.layout.GroupLayout(AlgorithmPanel);
        AlgorithmPanel.setLayout(AlgorithmPanelLayout);
        AlgorithmPanelLayout.setHorizontalGroup(
            AlgorithmPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, AlgorithmPanelLayout.createSequentialGroup()
                .add(AlgorithmPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, AlgorithmInfoButtom, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .add(AlgorithmPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(AlgorithmButtom, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                .add(4, 4, 4))
            .add(AlgorithmPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(AlgorithmLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
            .add(AlgorithmPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(AlgorithmLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
            .add(AlgorithmPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(AlgorithmLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, AlgorithmPanelLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .add(RestartButtom)
                .add(40, 40, 40))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, AlgorithmPanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .add(DetailButtom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(24, 24, 24))
        );
        AlgorithmPanelLayout.setVerticalGroup(
            AlgorithmPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(AlgorithmPanelLayout.createSequentialGroup()
                .add(AlgorithmInfoButtom)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(AlgorithmButtom)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(AlgorithmLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(AlgorithmLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(AlgorithmLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(DetailButtom)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(RestartButtom)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(resourceMap.getIcon("jLabel1.icon")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(resourceMap.getColor("jLabel1.border.lineColor"), 1, true)); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(SourcePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(GraphPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(AlgorithmPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(AlgorithmPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel1))
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(GraphPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(SourcePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(gui.Interface.class).getContext().getActionMap(InterfaceView.class, this);
        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setText(resourceMap.getString("exitMenuItem.text")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setText(resourceMap.getString("aboutMenuItem.text")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        InfoFrame.setTitle(resourceMap.getString("InfoFrame.title")); // NOI18N
        InfoFrame.setBounds(new java.awt.Rectangle(50, 50, 300, 300));
        InfoFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        InfoFrame.setName("InfoFrame"); // NOI18N
        InfoFrame.setResizable(false);

        InfoLabel.setFont(resourceMap.getFont("InfoLabel.font")); // NOI18N
        InfoLabel.setForeground(resourceMap.getColor("InfoLabel.foreground")); // NOI18N
        InfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InfoLabel.setText(resourceMap.getString("InfoLabel.text")); // NOI18N
        InfoLabel.setName("InfoLabel"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        InfoTextArea.setEnabled(false);
        InfoTextArea.setName("InfoTextArea"); // NOI18N
        jScrollPane2.setViewportView(InfoTextArea);

        org.jdesktop.layout.GroupLayout InfoFrameLayout = new org.jdesktop.layout.GroupLayout(InfoFrame.getContentPane());
        InfoFrame.getContentPane().setLayout(InfoFrameLayout);
        InfoFrameLayout.setHorizontalGroup(
            InfoFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, InfoFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(InfoFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, InfoLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                .addContainerGap())
        );
        InfoFrameLayout.setVerticalGroup(
            InfoFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(InfoFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(InfoLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );

        ResultFrame.setTitle(resourceMap.getString("ResultFrame.title")); // NOI18N
        ResultFrame.setBounds(new java.awt.Rectangle(50, 50, 400, 600));
        ResultFrame.setName("ResultFrame"); // NOI18N

        ResultLabel.setFont(resourceMap.getFont("ResultLabel.font")); // NOI18N
        ResultLabel.setForeground(resourceMap.getColor("ResultLabel.foreground")); // NOI18N
        ResultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ResultLabel.setText(resourceMap.getString("ResultLabel.text")); // NOI18N
        ResultLabel.setName("ResultLabel"); // NOI18N

        ResultIcon.setIcon(resourceMap.getIcon("ResultIcon.icon")); // NOI18N
        ResultIcon.setText(resourceMap.getString("ResultIcon.text")); // NOI18N
        ResultIcon.setName("ResultIcon"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        ResultTextArea.setFont(resourceMap.getFont("ResultTextArea.font")); // NOI18N
        ResultTextArea.setName("ResultTextArea"); // NOI18N
        jScrollPane1.setViewportView(ResultTextArea);

        org.jdesktop.layout.GroupLayout ResultFrameLayout = new org.jdesktop.layout.GroupLayout(ResultFrame.getContentPane());
        ResultFrame.getContentPane().setLayout(ResultFrameLayout);
        ResultFrameLayout.setHorizontalGroup(
            ResultFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(ResultFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(ResultFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .add(ResultFrameLayout.createSequentialGroup()
                        .add(ResultIcon)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(ResultLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 247, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ResultFrameLayout.setVerticalGroup(
            ResultFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(ResultFrameLayout.createSequentialGroup()
                .add(ResultFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(ResultFrameLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(ResultIcon))
                    .add(ResultFrameLayout.createSequentialGroup()
                        .add(23, 23, 23)
                        .add(ResultLabel)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setComponent(mainPanel);
        setMenuBar(menuBar);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo privado que responde a um clique no
     * Radio "Digitar o destino do arquivo"
     * @param evt evento de clique do mouse
     */
    private void GraphChoice1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphChoice1MouseReleased
        if(firstChoice){
            //desbilita 1, habilita 2
            ChangeChoice1(false);
        }
        else{
            //habilita 1, desabilita 2
            ChangeChoice1(true);
            
        }
    }//GEN-LAST:event_GraphChoice1MouseReleased

    /**
     * Metodo privado que responde a um clique no
     * Radio "Especificar o arquivo"
     * @param evt evento de clique do mouse
     */
    private void GraphChoice2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphChoice2MouseReleased
        if(secondChoice){
            //habilita 2, desabilita 1
            ChangeChoice2(false);
        }
        else{
            //desabilita 2, habilita 1
            ChangeChoice2(true);
        }
    }//GEN-LAST:event_GraphChoice2MouseReleased

    /**
     * Metodo privado que responde a um clique no
     * icone para procurar o arquivo
     * @param evt evento de clique do mouse
     */
    private void GraphSelectionButtomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphSelectionButtomMouseReleased
        //clique no botao de escolher arquivo
        if(GraphSelectionButtom.isEnabled()){
            FileChooser = new JFileChooser();
            option = FileChooser.showOpenDialog(mainPanel);

            if (option == JFileChooser.APPROVE_OPTION) {
                GraphLabel3.setText((FileChooser.getSelectedFile()).toString());
            }

            return;
        }
        System.out.println("BOTAO DESABILITADO!");
    }//GEN-LAST:event_GraphSelectionButtomMouseReleased

    /**
     * Metodo privado que responde a um clique no
     * botao "Pronto!" para a escolha do grafo
     * @param evt evento de clique do mouse
     */
    private void GraphCheckButtomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphCheckButtomMouseReleased
        //verificar o arquivo de entrada
        try {
            if (firstChoice) {
                status = this.FileIn(GraphTextArea.getText() + ".txt");
            }
            else {
                status = this.FileIn(GraphLabel3.getText());
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            status = false;
            message = "Digite o nome do arquivo!";
            JOptionPane.showMessageDialog(null, message, "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        if(status){
            //passar para o proximo passo
            ActivateStep1(false);

            //criar a lista de opcoes para vertices de origem
            numeroDeVertices = listAdj.getNumVertices();
            options = new String[numeroDeVertices+1];
            options[0] = "--";
            for(int i=1; i<options.length; i++){
                options[i] = "Vertice " + i;
            }
            SourceOptions.setModel(new javax.swing.DefaultComboBoxModel(options));
        }
    }//GEN-LAST:event_GraphCheckButtomMouseReleased

    /**
     * Metodo privado que responde a um clique no
     * botao "Refazer" para a escolha do grafo
     * @param evt evento de clique do mouse
     */
    private void GraphCancelButtomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphCancelButtomMouseReleased
        //habilitar devidamente os passos
        AlgorithmButtom.setEnabled(false);
        ActivateStep1(true);
        
    }//GEN-LAST:event_GraphCancelButtomMouseReleased

    /**
     * Metodo privado que responde a um clique no
     * icone "Informacoes" para a escolha do grafo
     * @param evt evento de clique do mouse
     */
    private void GraphInfoButtomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphInfoButtomMouseReleased
        InfoFrame.setVisible(true);
        InfoTextArea.setText(graphInfo);
    }//GEN-LAST:event_GraphInfoButtomMouseReleased

    /**
     * Metodo privado que responde a um clique no
     * botao "Pronto!" para a escolha da origem
     * @param evt evento de clique do mouse
     */
    private void SourceCheckButtomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SourceCheckButtomMouseReleased
        //verificar se foi escolhida uma origem
        option = SourceOptions.getSelectedIndex();

        if(option != 0){ //se uma opcao valida for escolhida
            if(SourceField.getText().equalsIgnoreCase("")){ //se nenhum numero foi digitado
                //CERTO! (escolha)
                ActivateStep2(false);
            }
            else{ //se um numero foi digitado
                if(Integer.toString(option).equalsIgnoreCase(SourceField.getText())){ //se os numeros sao iguais
                    //CERTO! (escolha / digitado)
                    ActivateStep2(false);
                }
                else{
                    //ESCOLHA UM DOS 2 NUMEROS!
                    message = "Você escolheu 2 vértices diferentes." +
                              "\nEscolha entre '" + option + "' ou '" + SourceField.getText() +  "'.";
                    JOptionPane.showMessageDialog(null, message, "Decida!", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        else{ //se a opcao "--" for escolhida
            if(!SourceField.getText().equalsIgnoreCase("")){ //se um numero valido for digitado
                //CERTO! (digitado)
                ActivateStep2(false);
                option = Integer.parseInt(SourceField.getText());
            }
            else{
                //DIGITE ALGUMA COISA PELOS MENOS
                message = "Escolha um dos vértices na caixa de seleção,\nou digite um número no campo destinado para tal.";
                JOptionPane.showMessageDialog(null, message, "Digite!", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_SourceCheckButtomMouseReleased

    /**
     * Metodo privado que responde a um clique no
     * botao "Refazer" para a escolha da origem
     * @param evt evento de clique do mouse
     */
    private void SourceCancelButtomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SourceCancelButtomMouseReleased
        //clique no botao "Refazer" para a escolha da origem
        if(SourceCancelButtom.isEnabled()){
            ActivateStep2(true);
        }
    }//GEN-LAST:event_SourceCancelButtomMouseReleased

    /**
     * Metodo privado que controla a digitacao no campo de escolha de vertices
     * so sao aceitos caracteres numericos e dentro dos limites do grafico gerado
     * @param evt evento de clique de tecla
     */
    private void SourceFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SourceFieldKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            //se houver tentativa de apagar
            message = SourceField.getText();
            return;
        }

        /* se o caractere nao for um numero
         * se o numero pedido for maior que o numero de vertices existente */
        if(!Character.isDigit(evt.getKeyChar()) || Integer.parseInt(SourceField.getText()) > numeroDeVertices){
            SourceField.setText(message);
        }
        else{
            message = SourceField.getText();
        }
    }//GEN-LAST:event_SourceFieldKeyReleased

    /**
     * Metodo privado que responde a um clique no
     * botao "Executar Bellman Ford" para executar o algoritmo
     * @param evt evento de clique do mouse
     */
    private void AlgorithmButtomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlgorithmButtomMousePressed
        if(AlgorithmButtom.isEnabled()){
            this.Execute();
            AlgorithmButtom.setEnabled(false);
            GraphCancelButtom.setEnabled(false);
            SourceCancelButtom.setEnabled(false);
            DetailButtom.setEnabled(true);
            RestartButtom.setEnabled(true);
        }
    }//GEN-LAST:event_AlgorithmButtomMousePressed

    /**
     * Metodo privado que responde a um clique no
     * botao "Recomecar" para reiniciar os dados do grafo
     * @param evt evento de clique do mouse
     */
    private void RestartButtomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestartButtomMouseReleased
        AlgorithmButtom.setEnabled(false);
        AlgorithmLabel2.setText("");
        AlgorithmLabel3.setText("");
        ActivateStep1(true);
}//GEN-LAST:event_RestartButtomMouseReleased

    /**
     * Metodo privado que responde a um clique no
     * icone "Informacoes" para a escolha da origem
     * @param evt evento de clique do mouse
     */
    private void SourceInfoButtomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SourceInfoButtomMouseReleased
        InfoFrame.setVisible(true);
        InfoTextArea.setText(sourceInfo);
    }//GEN-LAST:event_SourceInfoButtomMouseReleased

    /**
     * Metodo privado que responde a um clique no
     * icone "Relatorio" para a execucao do algoritmo
     * @param evt evento de clique do mouse
     */
    private void DetailButtomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailButtomMouseReleased
        if(DetailButtom.isEnabled()){
            ResultFrame.setVisible(true);
            ResultTextArea.setText(saida.getMessage());
        }
    }//GEN-LAST:event_DetailButtomMouseReleased

   /**
     * Metodo privado que responde a um clique no
     * icone "Informacoes" para a execução do algoritmo
     * @param evt evento de clique do mouse
     */
    private void AlgorithmInfoButtomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlgorithmInfoButtomMouseReleased
        InfoFrame.setVisible(true);
        InfoTextArea.setText(algorithmInfo);
}//GEN-LAST:event_AlgorithmInfoButtomMouseReleased


//***************************METODOS AUXILIARES*********************************

    /**
     * Metodo privado que manipula a opcao 1 de escolha de arquivo
     * @param status true(ativa) e false (desativa)
     */
    private void ChangeChoice1(boolean status){
        firstChoice = status;
        GraphChoice1.setEnabled(true);
        GraphTextArea.setEnabled(status);

        secondChoice = !status;
        GraphChoice2.setEnabled(true);
        GraphSelectionButtom.setEnabled(!status);

        GraphChoice2.doClick();
    }

    /**
     * Metodo privado que manipula a opcao 2 de escolha de arquivo
     * @param status true(ativa) e false (desativa)
     */
    private void ChangeChoice2(boolean status){
        secondChoice = status;
        GraphChoice2.setEnabled(true);
        GraphSelectionButtom.setEnabled(status);

        firstChoice = !status;
        GraphChoice1.setEnabled(true);
        GraphTextArea.setEnabled(!status);

        GraphChoice1.doClick();
    }

    /**
     * Metodo privado que manipula os campos que recebem informacoes com base
     * no campo de escolha de arquivo
     * @param status true(ativa o campo) e false (desativa o campo)
     */
    private void ActivateStep1(boolean status){
        //manipular passo 1
        GraphChoice1.setEnabled(status);
        GraphChoice2.setEnabled(status);
        if(firstChoice){
            GraphTextArea.setEnabled(status);
        }
        if(secondChoice){
            GraphSelectionButtom.setEnabled(status);
        }
        GraphCheckButtom.setEnabled(status);
        GraphCancelButtom.setEnabled(!status); //era TRUE antes...:/
        
        //manipular passo 2
        SourceOptions.setEnabled(!status);
        SourceField.setEnabled(!status);
        SourceCheckButtom.setEnabled(!status);
        SourceCancelButtom.setEnabled(!status);
        
    }

    /**
     * Metodo privado que manipula os campos que recebem informacoes com base
     * no campo de escolha de origem
     * @param status true(ativa o campo) e false (desativa o campo)
     */
    private void ActivateStep2(boolean status){
        //manipular passo 2
        SourceOptions.setEnabled(status);
        SourceField.setEnabled(status);
        SourceCancelButtom.setEnabled(!status);
        SourceCheckButtom.setEnabled(status);

        //manipular passo 3
        AlgorithmButtom.setEnabled(!status);
        
    }

    /** Método que confere se o arquivo é de texto;
     * e cria a lista de adjacencia do grafo;
     * @param fileName String com o nome completo do caminho do arquivo
     * @return boolean true(sucesso) e false (erros de execucao)
     */
    private boolean FileIn(String fileName){
        if(fileName.substring(fileName.length()-4).equalsIgnoreCase(".txt")){
            //se for um arquivo de texto
            try{
                entrada = new Entrada(fileName);
                listAdj = entrada.buildGraph();
                if(listAdj == null){
                    throw new FileNotFoundException();
                }
                return true;
            }
            catch(FileNotFoundException e){
                message = "Arquivo nao encontrado...";
                JOptionPane.showMessageDialog(null, message, "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
            catch(IOException e){
                message = "Arquivo nao pode ser usado...";
                JOptionPane.showMessageDialog(null, message, "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException e){
                message = "Arquivo em formato inadequado (apenas números!)";
                JOptionPane.showMessageDialog(null, message, "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
            catch(ArrayIndexOutOfBoundsException e){
                message = "Arquivo em formato inadequado (numero de vértices incorreto!)";
                JOptionPane.showMessageDialog(null, message, "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Por Favor, escolha um arquivo de texto.", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /**
     * Metodo privado que cria o grafo a partir das informacoes obtidas
     * nos passos 1 e 2;
     * cria uma saida diferente no caso de presenca de ciclos negativos
     */
    private void Execute(){
        graph = (GraphAbstract)listAdj;
        algorithm = new BellmanFord(graph, --option);

        ciclosNegativos = algorithm.bellmanFord();

        if(ciclosNegativos.isEmpty()){//se nao houver ciclos negativos
            AlgorithmLabel2.setText("Algoritmo completado com sucesso.");
            AlgorithmLabel3.setText("Ciclos Negativos: NAO");
            
            saida = new Saida("Saida.txt");
            try{
                if(!saida.Write(option, algorithm.getShortestWay())){
                    message = "Não foi possivel criar o arquivo de saida!!!";
                    JOptionPane.showMessageDialog(null, message, "ERRO!", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            catch(IOException e){
                message = "Não foi possivel criar o arquivo de saida!!!";
                JOptionPane.showMessageDialog(null, message, "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            AlgorithmLabel2.setText("Algoritmo não pôde ser completado.");
            AlgorithmLabel3.setText("Ciclos Negativos: SIM");

            saida = new Saida("SaidaNegativa.txt");
            try{
                if(!saida.Write(option, ciclosNegativos)){
                    message = "Não foi possivel criar o arquivo de saida!!!";
                    JOptionPane.showMessageDialog(null, message, "ERRO!", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(IOException e){
                message = "Não foi possivel criar o arquivo de saida!!!";
                JOptionPane.showMessageDialog(null, message, "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlgorithmButtom;
    private javax.swing.JLabel AlgorithmInfoButtom;
    private javax.swing.JLabel AlgorithmLabel1;
    private javax.swing.JLabel AlgorithmLabel2;
    private javax.swing.JLabel AlgorithmLabel3;
    private javax.swing.JPanel AlgorithmPanel;
    private javax.swing.JButton DetailButtom;
    private javax.swing.JButton GraphCancelButtom;
    private javax.swing.JButton GraphCheckButtom;
    private javax.swing.JRadioButton GraphChoice1;
    private javax.swing.JRadioButton GraphChoice2;
    private javax.swing.JLabel GraphInfoButtom;
    private javax.swing.JLabel GraphLabel1;
    private javax.swing.JLabel GraphLabel2;
    private javax.swing.JLabel GraphLabel3;
    private javax.swing.JPanel GraphPanel;
    private javax.swing.JLabel GraphSelectionButtom;
    private javax.swing.JTextField GraphTextArea;
    private javax.swing.JFrame InfoFrame;
    private javax.swing.JLabel InfoLabel;
    private javax.swing.JTextPane InfoTextArea;
    private javax.swing.JButton RestartButtom;
    private javax.swing.JFrame ResultFrame;
    private javax.swing.JLabel ResultIcon;
    private javax.swing.JLabel ResultLabel;
    private javax.swing.JTextPane ResultTextArea;
    private javax.swing.JButton SourceCancelButtom;
    private javax.swing.JButton SourceCheckButtom;
    private javax.swing.JTextField SourceField;
    private javax.swing.JLabel SourceInfoButtom;
    private javax.swing.JLabel SourceLabel1;
    private javax.swing.JLabel SourceLabel2;
    private javax.swing.JComboBox SourceOptions;
    private javax.swing.JPanel SourcePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

    //My variables
    private boolean firstChoice, secondChoice = false;
    private int option;
    private boolean status;
    private String[] options;
    private String message = "";
    private int numeroDeVertices = 0;

    private Entrada entrada;
    private Saida saida;
    private ArrayList<CicloNegativo> ciclosNegativos;
    private JFileChooser FileChooser;
    private Graph listAdj;
    private GraphAbstract graph;
    private BellmanFord algorithm;

    private JDialog aboutBox;


    final String graphInfo =
            "ARQUIVO DE ENTRADA\n\n" +
            "FORMATO: a formatação do grafo deverá seguir rigorosamente as normas estipuladas abaixo:\n" +
            "\t- Conter o número de vérices na primeira linha\n" +
            "\t- Nas demais linhas, conter o número do vértice e os respectivos pesos para TODOS os outros vértices" +
                "em caso de não-adjacência, o peso deverá ser marcado como \'10000\' e o peso para o mesmo vértice é de \'0 (zero)\'." +
                " Não há restrições para o peso.\n\n" +
            "EXTENSÃO: somente serão aceitos arquivos \'*.txt\' (arquivos de texto)\n\n" +
            "EXEMPLO:\n" +
            "3\n1 0 13 10000\n2 0 0 21\n3 12 4 0";

    final String sourceInfo =
            "ESCOLHA DA ORIGEM\n\n" +
            "Para escolher a origem, selecione uma das opções propostas ou, se preferir," +
            "digite o número do vértice desejado.\n" +
            "A origem será a base para todo o algoritmo, uma vez que ela indica o ponto de partida" +
            "para atingir os demais vértices.\n" +
            "A qualquer momento você pode escolher outra origem e re-executar o algoritmo.\n\n:D";

    final String algorithmInfo =
            "ALGORITMO DE BELLMAN FORD\n\n" +
            "O algoritmo de Bellman Ford baseia-se em grafos ponderados, direcionados ou não." +
            "Através da escolha de uma origem, o algoritmo encarrega-se de calcular caminho de menor custo" +
            "(baseado nos pesos pré-definidos) até todos os demais vértices, utilizando o conceito de relexamento de arestas.\n" +
            "Este algoritmo de \'menor caminho\' permite cálculos com grafos de ciclos negativos, entretanto, a solução é indefinida.";
}
