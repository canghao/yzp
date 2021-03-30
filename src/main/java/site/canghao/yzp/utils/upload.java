package site.canghao.yzp.utils;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import org.bytedeco.javacpp.opencv_core;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
public class upload{
	/**
	 * ��ȡ��ƵͼƬ
	 * @param videofile  Դ��Ƶ�ļ�·�� 
	 * @param framefile  ��ȡ֡��ͼƬ���·��
	 * @param imgfile ��Ƶ����ͼ����·��
	 * @return
	 */
	public static String getVedioImg(String videofile, String framefile,String imgfile){
		String ImgUrl="";
	    //��ȡ����ͼ
		try {
			fetchFrame(videofile, framefile);
		} catch (Exception e) {
			e.printStackTrace();
		}
        // ������ImgUrl
       ImgUrl = imgfile;//��Ƶ����ͼ����·��
       return ImgUrl;
	 }
/**
     * ��ȡָ����Ƶ��֡������ΪͼƬ��ָ��Ŀ¼
     * @param videofile  Դ��Ƶ�ļ�·�� 
     * @param framefile  ��ȡ֡��ͼƬ���·�� ����F:\hfkjrecorder\target\4.jpg
     * @throws Exception
     */
  public static void fetchFrame(String videofile, String framefile) throws Exception {
        //long start = System.currentTimeMillis();
        File targetFile = new File(framefile);
        FFmpegFrameGrabber ff = new FFmpegFrameGrabber(videofile);
        ff.start();
        int lenght = ff.getLengthInFrames();
        int i = 0;
        int interceptionFrames = 30;//��ȡ�ڼ�֡
        //Ĭ�Ͻ�ȡ��50֡�������50֡������Ƶ��֡����8��ֱ��ȡ����lenght * 0.3
        if(interceptionFrames >= lenght * 0.8) {
            interceptionFrames = (int)(lenght * 0.3);
        }
        Frame f = null;
        while (i < lenght) {
            // ���� ǰ  interceptionFrames ֡���������ȫ�ڵ�ͼƬ�����Լ��������
            f = ff.grabFrame();
            if ((i > interceptionFrames) && (f.image != null)) {
                break;
            }
            i++;
        }
        opencv_core.IplImage img = f.image;
        int owidth = img.width();
        int oheight = img.height();
        // �Խ�ȡ��֡���еȱ������� ��350����160
//        if(owidth > oheight) {//����ڸ�
//            
//        }else {//�ߴ��ڿ�
//            
//        }
        int width = 800;
        int height = (int) (((double) width / owidth) * oheight);
        /**
         width - ������ͼ��Ŀ��
         height - ������ͼ��ĸ߶�
         imageType - ������ͼ�������
         TYPE_3BYTE_BGR - ��ʾһ������ 8 λ RGB ��ɫ������ͼ�񣬶�Ӧ�� Windows ���� BGR ��ɫģ�ͣ������� 3 �ֽڴ洢�� Blue��Green �� Red ������ɫ��
         */
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        //�˷������� Graphics2D�����˴��ǳ����������ԵĿ��ǡ�
        bi.getGraphics().drawImage(f.image.getBufferedImage().getScaledInstance(width, height, Image.SCALE_SMOOTH),
                0, 0, null);
        ImageIO.write(bi, "jpg", targetFile);
        //ff.flush();
        ff.stop();
      //  System.out.println(System.currentTimeMillis() - start);
     }

}
