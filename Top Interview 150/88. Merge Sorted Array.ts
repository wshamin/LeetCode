/**
 Do not return anything, modify nums1 in-place instead.
 */
function merge(nums1: number[], m: number, nums2: number[], n: number): void {
    const slicedNums1 = nums1.slice(0, m);
    const slicedNums2 = nums2.slice(0, n);

    let resultArray = [];

    while (slicedNums1.length > 0 && slicedNums2.length > 0) {
        if (slicedNums1[0] <= slicedNums2[0]) {
            resultArray.push(slicedNums1.shift());
        } else {
            resultArray.push(slicedNums2.shift());
        }
    }

    if (slicedNums1.length > slicedNums2.length) {
        resultArray = resultArray.concat(slicedNums1)
    } else {
        resultArray = resultArray.concat(slicedNums2);
    }

    for (let i = 0; i < resultArray.length; i++) {
        nums1[i] = resultArray[i];
    }
}
