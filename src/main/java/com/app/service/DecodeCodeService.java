package com.app.service;

import com.app.Node;
import com.app.utils.TreeUtils;

import java.util.ArrayList;
import java.util.List;

public class DecodeCodeService {

    public List<String> decodeCode(String code) {
        if (code.length() > 4) {
            throw new RuntimeException("Invalid code");
        }

        List<String> messages = new ArrayList<>();
        getTranslation(TreeUtils.buildMorseTree(), code, messages, 0);

        return messages;
    }

    public void getTranslation(Node node, String code, List<String> messages, Integer nextCodeIndex) {
        if (nextCodeIndex > code.length() - 1) {
            messages.add(node.getValue());
            return;
        }
        switch (code.charAt(nextCodeIndex)) {
            case '.':
                getTranslation(node.getLeft(), code, messages, ++nextCodeIndex);
                break;
            case '-':
                getTranslation(node.getRight(), code, messages, ++nextCodeIndex);
                break;
            default:
                getTranslation(node.getLeft(), code, messages, ++nextCodeIndex);
                getTranslation(node.getRight(), code, messages, ++nextCodeIndex);
                break;
        }
    }
}
