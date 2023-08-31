package org.example.service;

import org.example.panels.SamplePanel;
import org.example.panels.start.FormFieldPanel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Writer {

    private static String sixPixSymbols = "fjlt";
    private static String twoPixSymbols = "Ii.";

    public static void writeNumber(int number, SamplePanel panel, int startX, int startY, int fieldLength, Graphics g) {
        String s = String.valueOf(number);
        char[] numbers = s.toCharArray();
        int startWritingX = startX + (fieldLength / 2 - 5) - ((numbers.length - 1) * 6);
        int shiftX = 12;
        BufferedImage numberImg = ImagesManager.getZero();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == '1') numberImg = ImagesManager.getOne();
            else if (numbers[i] == '2') numberImg = ImagesManager.getTwo();
            else if (numbers[i] == '3') numberImg = ImagesManager.getThree();
            else if (numbers[i] == '4') numberImg = ImagesManager.getFour();
            else if (numbers[i] == '5') numberImg = ImagesManager.getFive();
            else if (numbers[i] == '6') numberImg = ImagesManager.getSix();
            else if (numbers[i] == '7') numberImg = ImagesManager.getSeven();
            else if (numbers[i] == '8') numberImg = ImagesManager.getEight();
            else if (numbers[i] == '9') numberImg = ImagesManager.getNine();
            else if (numbers[i] == '0') numberImg = ImagesManager.getZero();
            g.drawImage(numberImg, startWritingX + shiftX * i, startY, panel);
        }
    }

    private static List<Character> getTextForDrawing(List<Character> text, int fieldWidth) {
        List<Character> resultList = new ArrayList<>();
        int textWidth = 2;
        int i = text.size() - 1;
        System.out.println(text + "text");
        while (textWidth < fieldWidth) {
            textWidth += getLetterWidth(text.get(i));
            resultList.add(0, text.get(i));
            i--;
        }
        return resultList;
    }

    private static int getLetterWidth(char letter) {
        if (sixPixSymbols.contains(String.valueOf(letter))) return  8;
        else if (twoPixSymbols.contains(String.valueOf(letter))) return  4;
        else return 12;
    }

    private static int getTextWidth(List<Character> text) {
        int textWidth = 2;
        for (Character character : text) textWidth += getLetterWidth(character);
        return textWidth;
    }

    public static void writeString(List<Character> text, FormFieldPanel panel, int fieldWidth, Graphics g) {
        BufferedImage symbolImg = ImagesManager.getZero();
        int x = 2;
        List<Character> forDrawingList;
        if (getTextWidth(text) >= fieldWidth) forDrawingList = getTextForDrawing(text, fieldWidth);
        else forDrawingList = text;
        for (Character character : forDrawingList) {
            if (character == '1') symbolImg = ImagesManager.getOne();
            else if (character == '2') symbolImg = ImagesManager.getTwo();
            else if (character == '3') symbolImg = ImagesManager.getThree();
            else if (character == '4') symbolImg = ImagesManager.getFour();
            else if (character == '5') symbolImg = ImagesManager.getFive();
            else if (character == '6') symbolImg = ImagesManager.getSix();
            else if (character == '7') symbolImg = ImagesManager.getSeven();
            else if (character == '8') symbolImg = ImagesManager.getEight();
            else if (character == '9') symbolImg = ImagesManager.getNine();
            else if (character == '0') symbolImg = ImagesManager.getZero();

            else if (character == 'A') symbolImg = ImagesManager.getAImg();
            else if (character == 'B') symbolImg = ImagesManager.getBImg();
            else if (character == 'C') symbolImg = ImagesManager.getCImg();
            else if (character == 'D') symbolImg = ImagesManager.getDImg();
            else if (character == 'E') symbolImg = ImagesManager.getEImg();
            else if (character == 'F') symbolImg = ImagesManager.getFImg();
            else if (character == 'G') symbolImg = ImagesManager.getGImg();
            else if (character == 'H') symbolImg = ImagesManager.getHImg();
            else if (character == 'I') symbolImg = ImagesManager.getIImg();
            else if (character == 'J') symbolImg = ImagesManager.getJImg();
            else if (character == 'K') symbolImg = ImagesManager.getKImg();
            else if (character == 'L') symbolImg = ImagesManager.getLImg();
            else if (character == 'M') symbolImg = ImagesManager.getMImg();
            else if (character == 'N') symbolImg = ImagesManager.getNImg();
            else if (character == 'O') symbolImg = ImagesManager.getOImg();
            else if (character == 'P') symbolImg = ImagesManager.getPImg();
            else if (character == 'Q') symbolImg = ImagesManager.getQImg();
            else if (character == 'R') symbolImg = ImagesManager.getRImg();
            else if (character == 'S') symbolImg = ImagesManager.getSImg();
            else if (character == 'T') symbolImg = ImagesManager.getTImg();
            else if (character == 'U') symbolImg = ImagesManager.getUImg();
            else if (character == 'V') symbolImg = ImagesManager.getVImg();
            else if (character == 'W') symbolImg = ImagesManager.getWImg();
            else if (character == 'X') symbolImg = ImagesManager.getXImg();
            else if (character == 'Y') symbolImg = ImagesManager.getYImg();
            else if (character == 'Z') symbolImg = ImagesManager.getZImg();

            else if (character == 'a') symbolImg = ImagesManager.getaImg();
            else if (character == 'b') symbolImg = ImagesManager.getbImg();
            else if (character == 'c') symbolImg = ImagesManager.getcImg();
            else if (character == 'd') symbolImg = ImagesManager.getdImg();
            else if (character == 'e') symbolImg = ImagesManager.geteImg();
            else if (character == 'f') symbolImg = ImagesManager.getfImg();
            else if (character == 'g') symbolImg = ImagesManager.getgImg();
            else if (character == 'h') symbolImg = ImagesManager.gethImg();
            else if (character == 'i') symbolImg = ImagesManager.getiImg();
            else if (character == 'j') symbolImg = ImagesManager.getjImg();
            else if (character == 'k') symbolImg = ImagesManager.getkImg();
            else if (character == 'l') symbolImg = ImagesManager.getlImg();
            else if (character == 'm') symbolImg = ImagesManager.getmImg();
            else if (character == 'n') symbolImg = ImagesManager.getnImg();
            else if (character == 'o') symbolImg = ImagesManager.getoImg();
            else if (character == 'p') symbolImg = ImagesManager.getpImg();
            else if (character == 'q') symbolImg = ImagesManager.getqImg();
            else if (character == 'r') symbolImg = ImagesManager.getrImg();
            else if (character == 's') symbolImg = ImagesManager.getsImg();
            else if (character == 't') symbolImg = ImagesManager.gettImg();
            else if (character == 'u') symbolImg = ImagesManager.getuImg();
            else if (character == 'v') symbolImg = ImagesManager.getvImg();
            else if (character == 'w') symbolImg = ImagesManager.getwImg();
            else if (character == 'x') symbolImg = ImagesManager.getxImg();
            else if (character == 'y') symbolImg = ImagesManager.getyImg();
            else if (character == 'z') symbolImg = ImagesManager.getzImg();

            else if (character == ' ') symbolImg = ImagesManager.getSpaceImg();

            g.drawImage(symbolImg, x, 7, panel);
            if (sixPixSymbols.contains(String.valueOf(character))) x += 8;
            else if (twoPixSymbols.contains(String.valueOf(character))) x += 4;
            else x += 12;
        }
    }
}
