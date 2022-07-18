#include <bits/stdc++.h>
#include <cmath>
using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
    int t;
    cin >> t;
    while(t--) {
        int a, m;
        cin >> a >> m;
        int arr[a];
        string s = "";

        for(int i = 0; i < m; i++) {
            s += 'B';
        }

        for(int i = 0; i < a; i++) {
            cin >> arr[i];
            int pos;
            int ind = arr[i] - 1;
            int val = m + 1 - arr[i] - 1;

            int posMin = min(ind, val);
            int posMax = max(ind, val);

            if (s.at(posMin) == 'A') pos = posMax;
            else pos = posMin; 

            s.erase(pos, 1);
            s.insert(pos, 1, 'A');
        }

        cout << s << endl;
    }
	
	return 0;
}