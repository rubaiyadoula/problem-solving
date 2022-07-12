#include <bits/stdc++.h>
#include <cmath>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);
	while(n--) {
		int t;
		cin >> t;
		int arr[t], res[t];
		
		for(int i = 0; i < t; i++) {
			cin >> arr[i];
		}

		for(int i = 0; i < t; i++) {
			int cn;
			cin >> cn;
			int pos = arr[i];
			while(cn--) {
				char seq;
				cin >> seq;
				if (seq == 'U' && pos == 0) {
					pos = 9;
				} else if (seq == 'U') {
					pos--;
				}
				else if (seq == 'D' && pos == 9) {
					pos = 0;
				} else if (seq == 'D') {
					pos++;
				}
			}
			res[i] = pos;
		}

		for(int i = 0; i < t; i++) {
			if (i == t - 1) cout << res[i] << endl;
			else cout << res[i] << " ";
		}
	}
}