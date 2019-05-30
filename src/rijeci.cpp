#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin >> n;
    int a = 0;
    int b = 1;
    for(int i = 1; i < n; i++) {
        int temp = a;
        a = b;
        b += temp;
    }
    printf("%d %d", a, b);
    return 0;
}