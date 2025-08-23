

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    
    
    public static long power(long a, long b, long c) {
        
        if (b == 0) {
            return 1;
        }

        
        long temp = power(a, b / 2, c);
        
        
        long result = (temp * temp) % c;

       
        if (b % 2 == 1) {
            result = (result * a) % c;
        }
        
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        
        System.out.println(power(A % C, B, C));
    }
}

//(A×B)(modC)=((A(modC))×(B(modC)))(modC)
/*
 
 15시는 3시와 같습니다. (15(mod12)=3)
17시는 5시와 같습니다. (17(mod12)=5)

이 둘을 더하면 15시 + 17시는 32시가 되고, 32시는 8시와 같습니다. (32(mod12)=8)
그런데 미리 나머지를 구해서 더하면, 3시 + 5시는 8시가 됩니다. (3+5=8)

곱셈도 마찬가지입니다.

15와 17을 곱하면 255가 되고, 255를 12로 나눈 나머지는 3입니다. (255(mod12)=3)
그런데 미리 나머지를 구해서 곱하면, (15 \pmod{12}) \times (17 \pmod{12})는 3 \times 5 = 15가 됩니다. 다시 12로 나눈 나머지는 3입니다. (15(mod12)=3)

결과는 똑같
 */

/*가장 쉬운 비유: 작은 자동차의 주행거리계 🚗
어려운 수학이나 코딩 용어는 잠시 잊고, 아주 단순한 상황을 상상해 보세요.

당신이 운전하는 자동차의 주행거리계(odometer)는 0부터 11까지만 표시할 수 있습니다. 12km를 달리는 순간 다시 0으로 돌아오는 아주 특별한 주행거리계죠. 이 주행거리계가 바로 나머지(%) 연산의 역할을 하는 겁니다.

두 가지 주행 방법
1. 한 번에 달리기 (비효율적인 방법)
총 110km를 달려야 한다고 가정해 봅시다. 당신은 110km를 한 번에 쭉 달립니다. 주행거리계는 12km를 달릴 때마다 계속 0으로 리셋되면서 숫자만 올라가겠죠. 최종적으로 110km를 달리고 나서 주행거리계를 확인하면, 숫자는 2를 가리키고 있을 겁니다.

이 방법은 비록 정확하지만, 만약 110km가 아니라 10 
11
  km 같은 어마어마한 거리라면, 계산이 너무 복잡해지고 숫자가 너무 커져서 주행거리계가 **고장(오버플로우)**날 수도 있습니다.

2. 나누어서 달리기 (효율적인 방법)
이제 분할 정복의 원리를 적용해 봅시다.
10×11을 계산한다고 생각하고, 이 거리를 두 구간으로 나눠서 달리는 겁니다.

첫 번째 구간: 10km를 달립니다. 주행거리계는 10을 가리킵니다.

두 번째 구간: 11km를 더 달려야 합니다. 여기서 핵심입니다! 굳이 11km를 더 달릴 필요 없이, 현재 주행거리계의 값(10)에 11을 더한 후 다시 리셋하면 됩니다.

10+11=21

주행거리계는 12 이상을 표시할 수 없으므로, 21을 12로 나눈 나머지를 구합니다.

21(mod12)=9

따라서 주행거리계는 9를 가리킵니다.

이런 식으로 계산 과정 중간에 **12를 넘는 값은 계속해서 나머지 값으로 '리셋'**시켜주면, 숫자는 항상 0~11 사이를 유지하게 됩니다.*/

