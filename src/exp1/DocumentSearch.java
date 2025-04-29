package exp1;

import java.util.Scanner;

public class DocumentSearch {
    public static void main(String[] args) {
        String d1 = "I like to watch the sun set with my friend.";
        String d2 = "The Best Places To Watch The Sunset.";
        String d3 = "My friend watch the sun come up.";
        String[] documents = {d1, d2, d3};
        String[] documentIds = {"d1.txt", "d2.txt", "d3.txt"};
        boolean found = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the keyword to search:");
        String keyword = scanner.nextLine();

        // 转换为小写以实现不区分大小写的匹配
        keyword = keyword.toLowerCase();

        // 子串匹配
        for (int i = 0; i < documents.length; i++) {
            if (documents[i].toLowerCase().contains(keyword)) {
                System.out.println(documentIds[i]);
                found = true;
            }
        }

        // 如果没有找到匹配的文档，输出提示信息
        if (!found) {
            System.out.println("No document found with the keyword: " + keyword);
        }

        scanner.close();
    }
}
