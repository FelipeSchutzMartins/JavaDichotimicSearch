package com.app.service;

import com.app.Node;
import com.app.utils.TreeUtils;

import java.util.ArrayList;
import java.util.List;

public class DichotomicSearchService {

    public List<String> dichotomicSearchBySignals(String signals) {
        if (signals.length() > 4) {
            throw new RuntimeException("Invalid code");
        }

        List<String> messages = new ArrayList<>();
        searchValuesOnTree(TreeUtils.buildMorseTree(), signals, messages, 0);

        return messages;
    }

    private void searchValuesOnTree(Node node, String signals, List<String> messages, Integer nextCodeIndex) {
        if (nextCodeIndex > signals.length() - 1) {
            messages.add(node.getValue());
            return;
        }
        switch (signals.charAt(nextCodeIndex)) {
            case '.':
                searchValuesOnTree(node.getLeft(), signals, messages, ++nextCodeIndex);
                break;
            case '-':
                searchValuesOnTree(node.getRight(), signals, messages, ++nextCodeIndex);
                break;
            default:
                searchValuesOnTree(node.getLeft(), signals, messages, nextCodeIndex + 1);
                searchValuesOnTree(node.getRight(), signals, messages, nextCodeIndex + 1);
                break;
        }
    }
}
