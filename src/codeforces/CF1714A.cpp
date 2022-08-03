#include <bits/stdc++.h>
using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);

	int t;
	cin >> t;
	while(t--) {
		int n, h, m;
		cin >> n >> h >> m;
		int sleepTimeMinute = (h*60) + m;
		int result = INT_MAX;
		for(int i = 0; i < n; i++) {
			int h1, m1;
			cin >> h1 >> m1;
			int temp = ((h1*60) + m1) - sleepTimeMinute;
			if (temp < 0) temp += 24*60;
			result = min(temp, result);
		}

		int hour = result / 60;
		int minute = result % 60;
		cout << hour << " " << minute << endl;
	}
	
	return 0;
}