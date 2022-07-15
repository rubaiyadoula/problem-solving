#include <bits/stdc++.h>
#include <cmath>
using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int t;
	cin >> t;
	while(t--) {
		int n, x;
		cin >> n >> x;
		int m = n * 2;
		int h[m];
		for(int i = 0; i < m; i++) {
			cin >> h[i];
		}

		sort(h, h + m);
		bool flag = true;
		for(int i = 0; i < n; i++) {
			if(h[i + n] - h[i] < x) {
				flag = false;
				break;
			}
		}

		if (flag) cout << "YES" << endl;
		else cout << "NO" << endl;
	}

	return 0;
}