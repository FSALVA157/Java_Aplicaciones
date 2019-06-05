package wordcloud;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import org.apache.commons.io.IOUtils;

import com.kennycason.kumo.CollisionMode;
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.bg.CircleBackground;
import com.kennycason.kumo.bg.PixelBoundryBackground;
import com.kennycason.kumo.font.KumoFont;
import com.kennycason.kumo.font.scale.LinearFontScalar;
import com.kennycason.kumo.font.scale.SqrtFontScalar;
import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import com.kennycason.kumo.nlp.FrequencyFileLoader;
import com.kennycason.kumo.palette.ColorPalette;

public class TestWordCloud {
	
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//final Dimension dimension = new Dimension(500, 312);//whale_small.png
		final Dimension dimension = new Dimension(600, 600);//circulo
		final WordCloud wordCloud = new WordCloud(dimension, CollisionMode.PIXEL_PERFECT);
		wordCloud.setPadding(2);
		
		//wordCloud.setBackground(new PixelBoundryBackground("backgrounds/whale_small.png"));
		wordCloud.setBackground(new CircleBackground(300));
		
		wordCloud.setColorPalette(new ColorPalette(new Color(0x4055F1), new Color(0x408DF1), new Color(0x40AAF1), new Color(0x40C5F1), new Color(0x40D3F1), new Color(0xFFFFFF)));
		//wordCloud.setKumoFont(new KumoFont(new Font("ProggyClean", Font.BOLD,14)));
		
		//wordCloud.setFontScalar(new LinearFontScalar(10, 40));
		wordCloud.setFontScalar(new SqrtFontScalar(10, 60));
		
		FrequencyFileLoader ffl = new FrequencyFileLoader();
		wordCloud.build(ffl.load(new File("text/palabrasfrecuentes.txt")));
		
		wordCloud.writeToFile("output/wordcloud.png");

	}

}
