/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Forms.FormQLTTPhong;
import Forms.ManHinhQuanLyPhong;
import static Forms.ManHinhQuanLyPhong.heightContainer;
import static Forms.ManHinhQuanLyPhong.soPhong;
import static Forms.ManHinhQuanLyPhong.widthContainer;
import Models.PhongDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author you have to better
 */
public class CreateRoomStatusMap {

    public static void createMapRoom(JPanel box, GridBagConstraints gbc, int floors, int rooms) {

        PhongDAO dao = new PhongDAO();
        Border outline = BorderFactory.createLineBorder(Color.BLACK);
//        box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));

        // khoi tao jpanel chua jlabel va jtoolbar
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.gridx = 0;
        gbc.gridy = floors;

        JPanel tang = new JPanel();
        tang.setToolTipText("" + (floors + 1));
        int width = widthContainer * rooms + 300;
        int height = heightContainer;
        tang.setPreferredSize(new Dimension(width, height));
//            tang.setLayout(new BoxLayout(tang, BoxLayout.X_AXIS));
        tang.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        tang.setAlignmentX(Component.LEFT_ALIGNMENT);
        tang.setBorder(outline);
        // khoi tao JLabel sau do them vao Jpanel
        JButton btnTangs = new JButton("Tang " + (floors + 1));
        btnTangs.setPreferredSize(new Dimension(widthContainer, heightContainer));
        btnTangs.setOpaque(true);
        btnTangs.setBackground(Color.BLUE);
        tang.add(btnTangs);
        // khoi tao JToolBar sau do them vao Jpanel
        JToolBar jtb = new JToolBar();
        tang.add(jtb);
        // Them Button phong vao jToolBar
        for (int j = 0; j < rooms; j++) {
            int numRoom = dao.RoomCodePerFloor(floors + 1).get(j).getMaPhong();
            JButton room = new JButton(numRoom + "");
            room.putClientProperty("Tang", new Integer(floors+1));
            room.putClientProperty("Phong", new Integer(j+1));
            room.setPreferredSize(new Dimension(widthContainer, heightContainer));
            room.addActionListener(new MouseClikXemThongTin());
            room.setOpaque(true);
            room.setBackground(Color.YELLOW);
            jtb.add(room);
        }

        JButton room = new JButton("+");
        room.setPreferredSize(new Dimension(widthContainer, heightContainer));
        room.addActionListener(new MouseClikXemThongTin());
        jtb.add(room);
        // Them Jpanel tang vao trong Jpanel jpnAreaRoomMap
        box.add(tang, gbc);
        box.revalidate();

    }

    public static class MouseClikXemThongTin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JButton button = (JButton) ae.getSource();
            ManHinhQuanLyPhong.posTang = (int) button.getClientProperty("Tang");
            ManHinhQuanLyPhong.posPhong = (int) button.getClientProperty("Phong");
            System.out.println("Tang: " + ManHinhQuanLyPhong.posTang + ", Phong:" + ManHinhQuanLyPhong.posPhong);
            FormQLTTPhong thongTinPhong = new FormQLTTPhong();
            thongTinPhong.setVisible(true);
        }
    }
}
