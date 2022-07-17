#include <bits/stdc++.h>
#include <cmath>
using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
    int t;
    cin >> t;
    while(t--) {
        int n;
        cin >> n;
        int arr[n];
        bool flag = true;
        cin >> arr[0];

        for(int i = 1; i < n; i++) {
            cin >> arr[i];
            if (arr[i] % arr[0] != 0) flag = false;
        }

        cout << (flag ? "YES" : "NO") << endl;
    }
	
	return 0;
}