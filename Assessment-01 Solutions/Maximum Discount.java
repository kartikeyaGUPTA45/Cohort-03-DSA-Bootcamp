Problem Statement: 
Sarah is purchasing items online and her total bill amounts to $Y.
She has two coupons she can use:
1) A coupon that gives a 15% discount on the total bill amount.
2) A coupon that provides a flat discount of $20 on the total bill amount.
What is the maximum discount Sarah can avail?

Input Format:
a single integer: Y - the bill amount before the discount.

Output Format:
the maximum discount Sarah can avail.

Solution: 
public static int MaximumDiscount(int Y) {
    int X = (Y*15)/100;
    if (X > 20) return X;
    else return 20;

  }
