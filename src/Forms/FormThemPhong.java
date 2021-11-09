package Forms;

import Entities.LoaiPhong;
import Entities.Phong;
import Entities.TrangThai;
import Models.LoaiPhongDAO;
import Models.PhongDAO;
import Models.TangDAO;
import Models.TrangThaiDAO;
import Utils.CreateRoomStatusMap;
import Utils.mgsBox;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author you have to better
 */
public class FormThemPhong extends javax.swing.JFrame {

    TangDAO tangDao;
    LoaiPhongDAO loaiPhongDao;
    PhongDAO phongDAo;
    TrangThaiDAO trangThaiDao;

    public FormThemPhong() {
        initComponents();
        setTitle("Thêm phòng");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSoPhongBD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblTang = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboTRangThai = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboLoaiPhong = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtSoPhongKT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Thêm phòng");

        jLabel2.setText("Số phòng từ:");

        jLabel3.setText("Tầng");

        lblTang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setText("Trạng thái");

        jLabel6.setText("Loại phòng");

        jLabel7.setText(">>>>>");

        jLabel8.setText("Ghi chú");

        btnThem.setText("Thêm phòng");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboTRangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHuy))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGhiChu))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTang, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSoPhongBD, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSoPhongKT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoPhongBD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoPhongKT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTRangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnHuy))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        increaseRoom();
    }//GEN-LAST:event_btnThemActionPerformed

    public void init() {
        tangDao = new TangDAO();
        loaiPhongDao = new LoaiPhongDAO();
        phongDAo = new PhongDAO();
        trangThaiDao = new TrangThaiDAO();
        lblTang.setText(String.valueOf(ManHinhQuanLyPhong.posTang));
        fillComboboxLoaiPhong();
        fillComboboxTrangThai();
    }
    List<Integer> lsTrung = new ArrayList<>();
    
    public void increaseRoom() {
        if (txtSoPhongBD.getText().trim().equals("") || (Integer.parseInt(txtSoPhongBD.getText()) > Integer.parseInt(txtSoPhongKT.getText()))) {
            mgsBox.alert(this, "Ma so phong bat dau chua dien hoac so phong bat dau lon hon so phong ket thuc");
        } else {
            boolean ch = false;
            int start = Integer.parseInt(txtSoPhongBD.getText());
            int end = Integer.parseInt(txtSoPhongKT.getText());

            for (int i = start; i <= end; i++) {
                if (checkTrungPhong(i)) {
                    phongDAo.insert(new Phong(i, ManHinhQuanLyPhong.posTang, cboLoaiPhong.getSelectedIndex() + 1, cboTRangThai.getSelectedIndex() + 1, txtGhiChu.getText()));
                    ch= true;
                } else {
                    lsTrung.add(i);
                }
            }
            if(ch){
                mgsBox.alert(this, "Them phong thanh cong");
                updateStatusScreen();
                this.setVisible(false);
            }else{
                mgsBox.alert(this, "Them phong that bai");
            }
        }
    }

    public boolean checkTrungPhong(int num) {
        List<Phong> lsPhong = phongDAo.RoomCodePerFloor(ManHinhQuanLyPhong.posTang);
        
        for (int j = 0; j < lsPhong.size(); j++) {
            if (num == lsPhong.get(j).getMaPhong()) {
                return false;
            }
        }
        return true;
    }

    public void fillComboboxLoaiPhong() {
        List<LoaiPhong> lsLoaiPhong = loaiPhongDao.selectAll();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboLoaiPhong.getModel();
        for (LoaiPhong loaiPhong : lsLoaiPhong) {
            model.addElement(loaiPhong.getTenLP());
        }
    }

    public void fillComboboxTrangThai() {
        List<TrangThai> lsTT = trangThaiDao.selectAll();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTRangThai.getModel();
        for (TrangThai trangThai : lsTT) {
            model.addElement(trangThai.getTenTrangThai());
        }
    }

    public void updateStatusScreen() {
        ManHinhQuanLyPhong.jpnAreaRoomMap.removeAll();
        ManHinhQuanLyPhong.setBox();
        List<Integer> ls = phongDAo.RoomPerFloor();
        for (int i = 0; i < ls.size(); i++) {
            CreateRoomStatusMap.createMapRoom(ManHinhQuanLyPhong.jpnAreaRoomMap, ManHinhQuanLyPhong.gbc, i, ls.get(i));
            ManHinhQuanLyPhong.jpnAreaRoomMap.revalidate();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cboLoaiPhong;
    private javax.swing.JComboBox<String> cboTRangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblTang;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtSoPhongBD;
    private javax.swing.JTextField txtSoPhongKT;
    // End of variables declaration//GEN-END:variables
}
