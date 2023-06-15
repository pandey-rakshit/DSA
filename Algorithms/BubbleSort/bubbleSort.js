// Bubble Sort

const bubbleSort = (array) => {
  const len = array.length;
  for (let i = 0; i < len; i++) {
    for (let j = 0; j < len - i - 1; j++) {
      if (array[j] < array[j + 1]) {
        const temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
      }
    }
  }
  return array;
};

const optimisedBubbleSort = (array) => {
  const len = array.length;
  for (let i = 0; i < len; i++) {
    let isSwapped = false;
    for (let j = 0; j < len - i - 1; j++) {
      if (array[j] < array[j + 1]) {
        const temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
        isSwapped = true;
      }
    }
    if (isSwapped === false) {
      break;
    }
  }
  return array;
};
