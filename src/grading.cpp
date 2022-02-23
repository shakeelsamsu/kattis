#include <iostream>

using namespace std;

int main() {
    int a, b, c, d, e, s;
    cin >> a >> b >> c >> d >> e >> s;
    if(s >= a)
        cout << "A\n";
    else if(s >= b)
        cout << "B\n";
    else if(s >= c)
        cout << "C\n";
    else if(s >= d)
        cout << "D\n";
    else if(s >= e)
        cout << "E\n";
    else    
        cout << "F\n";
}

