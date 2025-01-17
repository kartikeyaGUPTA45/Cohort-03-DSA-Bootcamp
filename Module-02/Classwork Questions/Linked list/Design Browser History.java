class Node {
    String url;
    Node next;
    Node prev;

    public Node(String url) {
        this.url = url;
    }
}


class BrowserHistory {
    Node head;
    Node currNode;
    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        currNode = head;
    }
    
    public void visit(String url) {
        Node n = new Node(url);

        n.prev = currNode;
        currNode.next = n;

        currNode = n;
    }
    
    public String back(int steps) {
        while(steps > 0) {
            if (currNode.prev != null) {
                currNode = currNode.prev;
            } else {
                break;
            }
            steps--;
        }

        return currNode.url;
    }
    
    public String forward(int steps) {
         while(steps > 0) {
            if (currNode.next != null) {
                currNode = currNode.next;
            } else {
                break;
            }
            steps--;
        }

        return currNode.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
