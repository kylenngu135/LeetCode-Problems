/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* deleteDuplicates(struct ListNode* head) {
    
    struct ListNode* it = head;

    while  (it != NULL && (*it).next != NULL) {
        struct ListNode check = *it;

        if ((*it).val == (*(*it).next).val) {
            (*it).next = (*(*it).next).next;
        } else {
            (it = (*it).next);
        }
    } 

    return head;
}
