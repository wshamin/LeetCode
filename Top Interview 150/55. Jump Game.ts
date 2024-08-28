function canJump(nums: number[]): boolean {
    let i = 0;

    while (i + nums[i] < nums.length - 1) {
        let maxProfit = nums[i];

        for (let j = 1; j <= nums[i]; j++) {
            let profit = j + nums[i + j];
            if (profit >= maxProfit) {
                i = i + j;
                maxProfit = profit;
            }
        }

        if (maxProfit === 0) {
            return false;
        }
    }

    return true;
}
