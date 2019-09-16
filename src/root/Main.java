import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static String xml = "<CATALOG>\n" +
            "<CD>\n" +
            "<TITLE>Empire Burlesque</TITLE>\n" +
            "<ARTIST>Bob Dylan</ARTIST>\n" +
            "<COUNTRY>USA</COUNTRY>\n" +
            "<COMPANY>Columbia</COMPANY>\n" +
            "<PRICE>10.90</PRICE>\n" +
            "<YEAR>1985</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Hide your heart</TITLE>\n" +
            "<ARTIST>Bonnie Tyler</ARTIST>\n" +
            "<COUNTRY>UK</COUNTRY>\n" +
            "<COMPANY>CBS Records</COMPANY>\n" +
            "<PRICE>9.90</PRICE>\n" +
            "<YEAR>1988</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Greatest Hits</TITLE>\n" +
            "<ARTIST>Dolly Parton</ARTIST>\n" +
            "<COUNTRY>USA</COUNTRY>\n" +
            "<COMPANY>RCA</COMPANY>\n" +
            "<PRICE>9.90</PRICE>\n" +
            "<YEAR>1982</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Still got the blues</TITLE>\n" +
            "<ARTIST>Gary Moore</ARTIST>\n" +
            "<COUNTRY>UK</COUNTRY>\n" +
            "<COMPANY>Virgin records</COMPANY>\n" +
            "<PRICE>10.20</PRICE>\n" +
            "<YEAR>1990</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Eros</TITLE>\n" +
            "<ARTIST>Eros Ramazzotti</ARTIST>\n" +
            "<COUNTRY>EU</COUNTRY>\n" +
            "<COMPANY>BMG</COMPANY>\n" +
            "<PRICE>9.90</PRICE>\n" +
            "<YEAR>1997</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>One night only</TITLE>\n" +
            "<ARTIST>Bee Gees</ARTIST>\n" +
            "<COUNTRY>UK</COUNTRY>\n" +
            "<COMPANY>Polydor</COMPANY>\n" +
            "<PRICE>10.90</PRICE>\n" +
            "<YEAR>1998</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Sylvias Mother</TITLE>\n" +
            "<ARTIST>Dr.Hook</ARTIST>\n" +
            "<COUNTRY>UK</COUNTRY>\n" +
            "<COMPANY>CBS</COMPANY>\n" +
            "<PRICE>8.10</PRICE>\n" +
            "<YEAR>1973</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Maggie May</TITLE>\n" +
            "<ARTIST>Rod Stewart</ARTIST>\n" +
            "<COUNTRY>UK</COUNTRY>\n" +
            "<COMPANY>Pickwick</COMPANY>\n" +
            "<PRICE>8.50</PRICE>\n" +
            "<YEAR>1990</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Romanza</TITLE>\n" +
            "<ARTIST>Andrea Bocelli</ARTIST>\n" +
            "<COUNTRY>EU</COUNTRY>\n" +
            "<COMPANY>Polydor</COMPANY>\n" +
            "<PRICE>10.80</PRICE>\n" +
            "<YEAR>1996</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>When a man loves a woman</TITLE>\n" +
            "<ARTIST>Percy Sledge</ARTIST>\n" +
            "<COUNTRY>USA</COUNTRY>\n" +
            "<COMPANY>Atlantic</COMPANY>\n" +
            "<PRICE>8.70</PRICE>\n" +
            "<YEAR>1987</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Black angel</TITLE>\n" +
            "<ARTIST>Savage Rose</ARTIST>\n" +
            "<COUNTRY>EU</COUNTRY>\n" +
            "<COMPANY>Mega</COMPANY>\n" +
            "<PRICE>10.90</PRICE>\n" +
            "<YEAR>1995</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>1999 Grammy Nominees</TITLE>\n" +
            "<ARTIST>Many</ARTIST>\n" +
            "<COUNTRY>USA</COUNTRY>\n" +
            "<COMPANY>Grammy</COMPANY>\n" +
            "<PRICE>10.20</PRICE>\n" +
            "<YEAR>1999</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>For the good times</TITLE>\n" +
            "<ARTIST>Kenny Rogers</ARTIST>\n" +
            "<COUNTRY>UK</COUNTRY>\n" +
            "<COMPANY>Mucik Master</COMPANY>\n" +
            "<PRICE>8.70</PRICE>\n" +
            "<YEAR>1995</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Big Willie style</TITLE>\n" +
            "<ARTIST>Will Smith</ARTIST>\n" +
            "<COUNTRY>USA</COUNTRY>\n" +
            "<COMPANY>Columbia</COMPANY>\n" +
            "<PRICE>9.90</PRICE>\n" +
            "<YEAR>1997</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Tupelo Honey</TITLE>\n" +
            "<ARTIST>Van Morrison</ARTIST>\n" +
            "<COUNTRY>UK</COUNTRY>\n" +
            "<COMPANY>Polydor</COMPANY>\n" +
            "<PRICE>8.20</PRICE>\n" +
            "<YEAR>1971</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Soulsville</TITLE>\n" +
            "<ARTIST>Jorn Hoel</ARTIST>\n" +
            "<COUNTRY>Norway</COUNTRY>\n" +
            "<COMPANY>WEA</COMPANY>\n" +
            "<PRICE>7.90</PRICE>\n" +
            "<YEAR>1996</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>The very best of</TITLE>\n" +
            "<ARTIST>Cat Stevens</ARTIST>\n" +
            "<COUNTRY>UK</COUNTRY>\n" +
            "<COMPANY>Island</COMPANY>\n" +
            "<PRICE>8.90</PRICE>\n" +
            "<YEAR>1990</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Stop</TITLE>\n" +
            "<ARTIST>Sam Brown</ARTIST>\n" +
            "<COUNTRY>UK</COUNTRY>\n" +
            "<COMPANY>A and M</COMPANY>\n" +
            "<PRICE>8.90</PRICE>\n" +
            "<YEAR>1988</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Bridge of Spies</TITLE>\n" +
            "<ARTIST>T'Pau</ARTIST>\n" +
            "<COUNTRY>UK</COUNTRY>\n" +
            "<COMPANY>Siren</COMPANY>\n" +
            "<PRICE>7.90</PRICE>\n" +
            "<YEAR>1987</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Private Dancer</TITLE>\n" +
            "<ARTIST>Tina Turner</ARTIST>\n" +
            "<COUNTRY>UK</COUNTRY>\n" +
            "<COMPANY>Capitol</COMPANY>\n" +
            "<PRICE>8.90</PRICE>\n" +
            "<YEAR>1983</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Midt om natten</TITLE>\n" +
            "<ARTIST>Kim Larsen</ARTIST>\n" +
            "<COUNTRY>EU</COUNTRY>\n" +
            "<COMPANY>Medley</COMPANY>\n" +
            "<PRICE>7.80</PRICE>\n" +
            "<YEAR>1983</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Pavarotti Gala Concert</TITLE>\n" +
            "<ARTIST>Luciano Pavarotti</ARTIST>\n" +
            "<COUNTRY>UK</COUNTRY>\n" +
            "<COMPANY>DECCA</COMPANY>\n" +
            "<PRICE>9.90</PRICE>\n" +
            "<YEAR>1991</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>The dock of the bay</TITLE>\n" +
            "<ARTIST>Otis Redding</ARTIST>\n" +
            "<COUNTRY>USA</COUNTRY>\n" +
            "<COMPANY>Stax Records</COMPANY>\n" +
            "<PRICE>7.90</PRICE>\n" +
            "<YEAR>1968</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Picture book</TITLE>\n" +
            "<ARTIST>Simply Red</ARTIST>\n" +
            "<COUNTRY>EU</COUNTRY>\n" +
            "<COMPANY>Elektra</COMPANY>\n" +
            "<PRICE>7.20</PRICE>\n" +
            "<YEAR>1985</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Red</TITLE>\n" +
            "<ARTIST>The Communards</ARTIST>\n" +
            "<COUNTRY>UK</COUNTRY>\n" +
            "<COMPANY>London</COMPANY>\n" +
            "<PRICE>7.80</PRICE>\n" +
            "<YEAR>1987</YEAR>\n" +
            "</CD>\n" +
            "<CD>\n" +
            "<TITLE>Unchain my heart</TITLE>\n" +
            "<ARTIST>Joe Cocker</ARTIST>\n" +
            "<COUNTRY>USA</COUNTRY>\n" +
            "<COMPANY>EMI</COMPANY>\n" +
            "<PRICE>8.20</PRICE>\n" +
            "<YEAR>1987</YEAR>\n" +
            "</CD>\n" +
            "</CATALOG>";

    private static boolean isValueTag(String tag, String line) {
        // tag = removeTagBrackets(tag);
        return (line.split(tag).length == 2);
    }

    private static String getTagValue(String line) {
        return line.substring(line.indexOf(">") + 1, line.indexOf("</"));
    }

    private static String removeEmptyLines(String text) {
        return text.replaceAll("(?m)^[ \t]*\r?\n", "");
    }

    private static String getTag(String line) {
        return line.substring(line.indexOf("<"), line.indexOf(">") + 1);
    }

    private static int countTagAppearances(String tag, String[] xmlLines) {
        int appareances = 0;
        for (String line : xmlLines) {
            if (line.contains(tag)) {
                appareances++;
            }
        }
        return appareances;
    }

    private static String generateCloseTag(String openTag) {
        return openTag.replace("<", "</");
    }

    private static boolean containEquivalentTagCount(String openTag, String[] lines) {
        int openTagCount = countTagAppearances(openTag, lines);
        String closeTag = generateCloseTag(openTag);
        int closeTagCount = countTagAppearances(closeTag, lines);
        return (openTagCount == closeTagCount);
    }

    private static boolean isValidXml(String xml) {
        String[] lines = removeEmptyLines(xml).split("\n");
        ArrayList<String> validatedTags = new ArrayList<String>();

        for (String line : lines) {
            String openTag = getTag(line);

            if (!validatedTags.contains(openTag) && !openTag.contains("/")) {
                if (containEquivalentTagCount(openTag, lines)) {
                    validatedTags.add(openTag);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private static String addNewLine(String value) {
        return value + "\n";
    }

    private static String removeTagBrackets(String tag) {
        return tag
                .replace("<", "")
                .replace("</", "")
                .replace(">", "");
    }

    private static String getMainProperty(String[] lines) {
        String mainTag = getTag(lines[0]);
        mainTag = String.format("\"%s\":{\n", removeTagBrackets(mainTag));
        return mainTag;
    }

    private static String[] removeMainTag(String[] lines) {
        ArrayList<String> arrLines = new ArrayList<String>(Arrays.asList(lines));
        arrLines.removeIf(line -> line.contains(getMainProperty(lines)));
        String[] newLines = Arrays.asList(arrLines.toArray()).toArray(new String[arrLines.size()]);
        return newLines;
    }

    private static String convertToJsonArrAttr(String xmlValue) {
        String tag = removeTagBrackets(getTag(xmlValue));
        return String.format("\"%s\": [\n", tag);
    }

    private static boolean isInteger(String str) {
        return str.matches("-?\\d+");
    }

    private static boolean isDecimal(String str) {
        return str.matches("([0-9]*)\\.([0-9]*)");
    }

    private static String convertToJsonAttrWithValue(String xmlValue) {
        String tag = removeTagBrackets(getTag(xmlValue));
        String value = getTagValue(xmlValue);
        if (isInteger(value) || isDecimal(value)) {
            return String.format("\"%s\": %s", tag, value);
        } else {
            return String.format("\"%s\": \"%s\"", tag, value);
        }
    }

    private static boolean isArrayTag(String tag, String[] lines) {
        int numTag = countTagAppearances(tag, lines);
        return (numTag > 1);
    }

    private static int getTagIndex(String tag, String[] attributes) {
        for (int i = 0; i < attributes.length; i++){
            if(attributes[i].equals(tag)){
                return i;
            }
        }

        return -1;
    }

    private static String generateObjectLines(String tag, String[] lines) {
        String sub = xml.substring(xml.indexOf(tag));
        String[] arrSub = sub.split(tag);
        String arrObjectLines = "";

        ArrayList<String> arrLines = new ArrayList<String>(Arrays.asList(arrSub));
        arrLines.remove(0);
        String closeTag = generateCloseTag(tag);
        int counter = 0;
        for (String line : arrLines) {
            String[] attrs = line.split("\n");
            attrs = Arrays.copyOfRange(attrs, 1, getTagIndex(closeTag, attrs));
            counter++;
            String json = "{ ";
            for (String attr : attrs) {
                String jsonAttr = convertToJsonAttrWithValue(attr);
                json += jsonAttr + ", ";
            }

            json = json.substring(0, json.lastIndexOf(",")) + " },";

            if (counter == arrLines.size()) {
                json = json.substring(0, json.lastIndexOf(","));
            }
            arrObjectLines += addNewLine(json);
        }
        return arrObjectLines;
    }

    private static String addJsonObjects(String jsonObjects){
        return addNewLine(jsonObjects) + "]";
    }

    private static String convertXmlToJson(String[] lines) {
        String obj = addNewLine("{");

        obj += addNewLine(getMainProperty(lines));
        lines = removeMainTag(lines);

        for (String line : lines) {
            String tag = getTag(line);

            if (isValueTag(tag, line)) {
                String jsonAttr = convertToJsonAttrWithValue(line);
                obj += addNewLine(jsonAttr);
            } else if (isArrayTag(tag, lines)) {
                String json = convertToJsonArrAttr(line);
                String jsonObjects = generateObjectLines(tag, lines);
                json += addJsonObjects(jsonObjects);
                obj += json;
                break;
            }
        }

        obj += "}\n}\n";
        return obj;
    }

    public static void main(String[] args) {
        String[] lines = removeEmptyLines(xml).split("\n");

        if (!isValidXml(xml)) {
            System.out.println("\n>>> Error: This is not a valid XML file!");
            return;
        }else{
            System.out.println("\n>>> Success: It's an okay XML file!\n");
            String json = convertXmlToJson(lines);
            System.out.println("\n\nConversion:\n\n" + json);
        }
    }
}