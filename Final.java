import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Final extends JFrame {
    MainForm mainForm = new MainForm();
    ArrayList <Input> list = new ArrayList<>();
    public Final(){
        init();
    }

    public void init(){

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(1,7));
        container.add(mainForm);
        AbstractTableModel model;
        container.add(new JScrollPane(new JTable(model = new AbstractTableModel() {
            @Override
            public int getRowCount() {
                return list.size();
            }

            @Override
            public int getColumnCount() {
                return 7;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                if (columnIndex == 0) {
                    System.out.println(list.get(rowIndex));
                    return list.get(rowIndex).getFirst();
                }
                else{
                    return list.get(rowIndex).getLast();
                }
            }
            @Override
            public String getColumnName(int column) {
                String [] columns = {"First", "Last", "Title", "Nick", "Display", " Emails", "Format"};
                return columns [column];
            }


        })));

        mainForm.emailPanel.addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String first = mainForm.namePanel.fnameField.getText();
                System.out.println(first);
                String last = mainForm.namePanel.lnameField.getText();
                String title = mainForm.namePanel.titleField.getText();
                String nick = mainForm.namePanel.nicknameField.getText();
                Input inp = new Input(first, last, title,nick, null, null,null);
                list.add(inp);
                model.fireTableDataChanged();
            }
        });


        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       new Final();
    }
}
