package Array;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LatestFileVersion {

    public static int findLatestFileVersion(String[] files) {
        int latestVersion = -1;
        Pattern pattern = Pattern.compile("File_(\\d+)");

        for (String file : files) {
            Matcher matcher = pattern.matcher(file);
            if (matcher.matches()) {
                int version = Integer.parseInt(matcher.group(1));
                latestVersion = Math.max(latestVersion, version);
            }
        }

        return latestVersion;
    }

    public static void main(String[] args) {
        String[] files = {"File_1", "File_3", "InvalidFile", "File_2"};
        int latestVersion = findLatestFileVersion(files);
        System.out.println("Latest file version: " + latestVersion);
    }
}