package dataStructure.list;


/**
 * 定义链表
 */
public class ListNode {
    private int data;
    private ListNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    /**
     * 链表的遍历需要完成以下步骤：
     * 1、沿指针遍历
     * 2、遍历时显示结点的内容或者计数
     * 3、当next指针的值为NULL时结束遍历
     */
    public int listLength(ListNode headNode) {
        int count = 1;
        ListNode currentNode = headNode;
        while (null != currentNode) {
            currentNode = currentNode.getNext();
            count++;
        }
        return count;
    }

    /**
     * 链表的插入可以分为三种情况：
     * 需要遍历到要需要插入的位置之前的结点进行插入，它需要知道前驱结点
     * 1、表头插入
     * 2、中间插入（随机）
     * 3、表尾插入
     */
    public ListNode insertNode(ListNode headNode, ListNode insertNode, int position) {
        if (null == headNode) return insertNode;
        int size = listLength(headNode);
        if (position > size || position < 1) {
            System.out.println("输入范围有误，正确范围为：1~" + (size + 1));
        }
        if (1 == position) {
            insertNode.setNext(headNode);
            return insertNode;
        } else {
            int count = 1;
            ListNode prevousNode = headNode;
            while (count < position - 1) {
                count++;
                prevousNode = prevousNode.getNext();
            }
            ListNode currentNode = prevousNode.getNext();
            insertNode.setNext(currentNode);
            prevousNode.setNext(insertNode);
        }
        return headNode;
    }


    /**
     * 链表的删除分为三种情况：
     * 1、删除链表的表头（第一个）结点
     * 2、删除链表的表尾（最后一个）结点
     * 3、删除钟表的中间结点
     */
    public ListNode deleteNode(ListNode headNode, int position) {
        int size = listLength(headNode);
        if (position < 1 || position > size) {
            System.out.println("输入有误，正确范围为：1~" + size);
        }
        if (1 == position) {
            ListNode currentNode = headNode.getNext();
            headNode = null;
            return currentNode;
        } else {
            int count = 1;
            ListNode previosNode = headNode;
            while (count < position) {
                count++;
                previosNode = previosNode.getNext();
            }
            ListNode currentNode = previosNode.getNext();
            previosNode.setNext(currentNode.getNext());
            currentNode = null;
        }
        return headNode;
    }

    /**
     * 删除链表
     *
     * @param headNode
     */
    public void deleteListNode(ListNode headNode) {
        ListNode node, it = headNode;
        while (null != it) {
            node = it.getNext();
            it = null;
            it = node;
        }
    }

}
