#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int l, n;
    cin >> l;
    cin >> n;
    int t = 0;
    int count = 0;
    cin.ignore(numeric_limits<streamsize>::max(),'\n'); 
    for(int i = 0; i < n; i++) {
        string line, q;
        int p;
        getline(cin, line);
        istringstream iss(line);
        iss >> q;
        iss >> p;
        if(q == "enter") {
            if(t + p > l)
                count++;
            else
                t += p;
        }
        else {
            t -= p;
        }
    }
    cout << count;
    return 0;
}

