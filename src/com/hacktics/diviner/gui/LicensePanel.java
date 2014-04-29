package com.hacktics.diviner.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;



public class LicensePanel extends JPanel {


	private static final long serialVersionUID = 1L;
	private static final String VERSION = "Version: " + "1.6.0 Beta";
	
	private static final String LICENSE = "<html><body><h1><p>Software License</p></h1>"
			+ "<p><strong>Diviner</strong></p>"
			+ "<p><strong>Author</strong>&nbsp;: Hacktics Team<br />"
			+ "	<strong>WWW</strong>&nbsp;: http://www.hacktics.com<br />"
			+ "	<strong>Email</strong>&nbsp;: support at hacktics dot com<br />"
			+ "	________________________________________________________</p>"
			+ "<p><strong>END-USER LICENSE AGREEMENT FOR THIS SOFTWARE</strong></p>"
			+ "<p>This End-User License Agreement (&quot;EULA&quot;) is a legal agreement between you (either an individual or a single entity) and the mentioned author of this Software<br /> for the software product identified above, which includes computer software and may include associated media, printed materials, and &quot;online&quot; or electronic documentation (&quot;SOFTWARE PRODUCT&quot;). By installing, copying, or otherwise using the SOFTWARE PRODUCT, you agree to be bound by the terms of this EULA. If you do not agree to the terms of this EULA, do not install or use the SOFTWARE PRODUCT.</p>"
			+ "<p>&nbsp;</p>"
			+ "<p><strong>SOFTWARE PRODUCT LICENSE</strong></p>"
			+ "<p>The SOFTWARE PRODUCT is protected by copyright laws and international copyright treaties, as well as other intellectual property laws and treaties. The SOFTWARE PRODUCT is licensed, not sold.</p><br />"
			+ "<p>The definition of SOFTWARE PRODUCT does not includes any files generated by the SOFTWARE PRODUCT, such as compiled script files in the form of standalone executables.</p><br />"
			+ "<p><strong>1. GRANT OF LICENSE</strong></p><br />"
			+ "<p>This EULA grants you the following rights:</p><br />"
			+ "<p>Installation and Use. You may install and use an unlimited number of copies of the SOFTWARE PRODUCT.</p>"
			+ "<p>Reproduction and Distribution. You may reproduce and distribute an unlimited number of copies of the SOFTWARE PRODUCT either in whole or in part; each copy should include all copyright and trademark<br /> notices, and shall be accompanied by a copy of this EULA. Copies of the SOFTWARE PRODUCT may be distributed as a standalone product or included with your own product.</p>"
			+ "<p>Commercial Use. You may use the SOFTWARE PRODUCT for commercial purposes. You may sell for profit and freely distribute scripts and/or compiled scripts that were created with the SOFTWARE PRODUCT.</p><br />"
			+ "<p>Reverse engineering. You may not reverse engineer or disassemble the SOFTWARE PRODUCT or compiled scripts that were created with the SOFTWARE PRODUCT.</p><br />"
			+ "<p><strong>2. COPYRIGHT</strong></p>"
			+ "<p>All title and copyrights in and to the SOFTWARE PRODUCT (including but not limited to any images, photographs, animations, video, audio, music, text, and &quot;applets&quot; incorporated into the SOFTWARE PRODUCT), the accompanying printed materials, and any copies of the SOFTWARE PRODUCT are owned by the Author of this Software. The SOFTWARE PRODUCT is protected by copyright laws and international treaty provisions. Therefore, you must treat the SOFTWARE PRODUCT like any other copyrighted material.</p>"
			+ "<p>&nbsp;</p>"
			+ "<p><strong>MISCELLANEOUS</strong></p>"
			+ "<p>If you acquired this product in Israel, this EULA is governed by the laws of the state of Israel. If this product was acquired outside the United Kingdom, then local law may apply.</p>"
			+ "<p>Should you have any questions concerning this EULA, or if you desire to contact the author of this Software for any reason, please contact him/her at the email address mentioned at the top of this EULA.</p>"
			+ "<p>&nbsp;</p>"
			+ "<p><strong>LIMITED WARRANTY</strong></p>"
			+ "<p><strong>1. NO WARRANTIES</strong></p>"
			+ "<p>The Author of this Software expressly disclaims any warranty for the SOFTWARE PRODUCT. The SOFTWARE PRODUCT and any related documentation is provided &quot;as is&quot; without warranty of any kind, either express or implied, <br />including, without limitation, the implied warranties or merchantability, fitness for a particular purpose, or non-infringement. The entire risk arising out of use or performance of the SOFTWARE PRODUCT remains with you.</p>"
			+ "<p><strong>2. NO LIABILITY FOR DAMAGES</strong></p>"
			+ "<p>In no event shall the author of this Software be liable for any damages whatsoever (including, without limitation, damages for loss of business profits, business interruption, loss of business information, or any other pecuniary loss) arising out of the use of or inability to use this product, even if the Author of this Software has been advised of the possibility of such damages. Because some states/jurisdictions do not allow the exclusion or limitation of liability for consequential or incidental damages, the above limitation may not apply to you.</p>"
			+ "<p>&nbsp;</p>"
			+ "<p>[END OF LICENSE]</p>"
			+ "<p>&nbsp;</p>"
			+ "<p>&nbsp;</p></body></html>"; 

	public LicensePanel() {
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		
		this.setBackground(Color.white);
		this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		
		JLabel lblLogo = new JLabel();
		JLabel lblProgramName = new JLabel();
		JLabel lblLicense = new JLabel();
		JLabel lblVersion = new JLabel(VERSION);
		
		lblLicense.setText(LICENSE);
		lblLicense.setName("lblDisclaimer");
		lblLicense.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblLicense.setBackground(Color.white);
		lblLicense.setHorizontalTextPosition(SwingConstants.LEFT);
		lblLogo.setIcon(GuiUtils.getGuiUtils().getLogoIcon());
		lblLogo.setName("lblLogo");
		lblLogo.setHorizontalTextPosition(SwingConstants.LEFT);

		
		lblProgramName.setText(Constant.PROGRAM_NAME_SHORT);
		lblProgramName.setFont(new Font("Default", Font.BOLD, 32));
		lblProgramName.setName("lblProgramName");
		lblProgramName.setHorizontalTextPosition(SwingConstants.LEFT);

		
		this.setFont(new Font("Default", Font.PLAIN, 11));
		
		JPanel topPanel = new JPanel(new GridLayout(3, 1));
		topPanel.add(lblProgramName);
		topPanel.add(lblLogo);
		topPanel.add(lblVersion);
		this.setLayout(new BorderLayout());
		this.add(topPanel, BorderLayout.NORTH);
		this.add(lblLicense, BorderLayout.CENTER);
		this.setPreferredSize(new Dimension(3040, 1000));

	}
}
