/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    
    struct ListNode* it = head;
    
    struct ListNode* prev = NULL;
    struct ListNode* next = NULL;

    while (it != NULL && (*it).next != NULL) {
        next = (*it).next;
        (*it).next = prev;
        prev = it;
        it = next;
    }
    if (prev != NULL) {
        (*it).next = prev;
    }

    return it;
}
