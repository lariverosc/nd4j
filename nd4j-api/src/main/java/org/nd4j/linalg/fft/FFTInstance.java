package org.nd4j.linalg.fft;

import org.nd4j.linalg.api.complex.IComplexNDArray;
import org.nd4j.linalg.api.ndarray.INDArray;


/**
 * Base line fft methods
 * @author Adam Gibson
 */
public interface FFTInstance {

    /**
     * FFT along a particular dimension
     * @param transform the ndarray to transform
     * @param numElements the desired number of elements in each fft
     * @return the ffted output
     */
    public IComplexNDArray fft(INDArray transform,int numElements);



    /**
     * 1d discrete fourier transform, note that this will
     * throw an exception if the passed in input
     * isn't a vector.
     * See matlab's fft2 for more information
     * @param inputC the input to transform
     * @return the the discrete fourier transform of the passed in input
     */
    public  IComplexNDArray fft(IComplexNDArray inputC);

    /**
     * 1d discrete fourier transform, note that this will
     * throw an exception if the passed in input
     * isn't a vector.
     * See matlab's fft2 for more information
     * @param input the input to transform
     * @return the the discrete fourier transform of the passed in input
     */
    public  IComplexNDArray fft(INDArray input);



    /**
     * FFT along a particular dimension
     * @param transform the ndarray to transform
     * @param numElements the desired number of elements in each fft
     * @return the ffted output
     */
    public IComplexNDArray fft(INDArray transform,int numElements,int dimension);


    /**
     * 1d discrete fourier transform, note that this will
     * throw an exception if the passed in input
     * isn't a vector.
     * See matlab's fft2 for more information
     * @param inputC the input to transform
     * @return the the discrete fourier transform of the passed in input
     */
    public  IComplexNDArray fft(IComplexNDArray inputC,int numElements);


    /**
     * 1d discrete fourier transform, note that this will
     * throw an exception if the passed in input
     * isn't a vector.
     * See matlab's fft2 for more information
     * @param inputC the input to transform
     * @return the the discrete fourier transform of the passed in input
     */
    public  IComplexNDArray fft(IComplexNDArray inputC,int numElements,int dimension);



    /**
     * IFFT along a particular dimension
     * @param transform the ndarray to transform
     * @param numElements the desired number of elements in each fft
     * @param dimension the dimension to do fft along
     * @return the iffted output
     */
    public IComplexNDArray ifft(INDArray transform,int numElements,int dimension);



    /**
     * 1d discrete fourier transform, note that this will
     * throw an exception if the passed in input
     * isn't a vector.
     * See matlab's fft2 for more information
     * @param inputC the input to transform
     * @return the the discrete fourier transform of the passed in input
     */
    public  IComplexNDArray ifft(IComplexNDArray inputC);



    /**
     * FFT along a particular dimension
     * @param transform the ndarray to transform
     * @param numElements the desired number of elements in each fft
     * @return the ffted output
     */
    public IComplexNDArray ifft(INDArray transform,int numElements);



    /**
     * 1d discrete fourier transform, note that this will
     * throw an exception if the passed in input
     * isn't a vector.
     * See matlab's fft2 for more information
     * @param inputC the input to transform
     * @return the the discrete fourier transform of the passed in input
     */
    public  IComplexNDArray ifft(IComplexNDArray inputC,int numElements,int dimension);





    /**
     * ND IFFT, computes along the first on singleton dimension of
     * transform
     * @param transform the ndarray to transform
     * @param dimension the dimension to iterate along
     * @param numElements the desired number of elements in each fft
     * @return the reverse ifft of the passed in array
     */
    public IComplexNDArray ifftn(INDArray transform,int dimension,int numElements);

    public IComplexNDArray irfftn(IComplexNDArray arr);


    public IComplexNDArray irfft(IComplexNDArray arr,int dimension);

    public IComplexNDArray irfft(IComplexNDArray arr);

    /**
     * ND IFFT
     * @param transform the ndarray to transform
     * @param dimension the dimension to iterate along
     * @param numElements the desired number of elements in each fft
     * @return the transformed array
     */
    public IComplexNDArray ifftn(IComplexNDArray transform,int dimension,int numElements);

    /**
     * Performs FFT along the first non singleton dimension of
     * transform. This means
     * @param transform the ndarray to transform
     * @param dimension the dimension to iterate along
     * @param numElements the desired number of elements in each fft
     *                    along each dimension from each slice (note: each slice)
     * @return the transformed array
     */
    public IComplexNDArray fftn(IComplexNDArray transform,int dimension,int numElements);


    /**
     * Computes the fft along the first non singleton dimension of transform
     * when it is a matrix
     * @param transform the ndarray to transform
     * @param dimension the dimension to do fft along
     * @param numElements the desired number of elements in each fft
     * @return the fft of the specified ndarray
     */
    public IComplexNDArray fftn(INDArray transform,int dimension,int numElements);

    /**
     * FFT on the whole array (n is equal the first dimension shape)
     * @param transform the matrix to transform
     * @return the ffted array
     */
    public IComplexNDArray fftn(INDArray transform);
    /**
     * FFT on the whole array (n is equal the first dimension shape)
     * @param transform the matrix to transform
     * @return the ffted array
     */
    public IComplexNDArray fftn(IComplexNDArray transform);

    public IComplexNDArray ifftn(IComplexNDArray transform,int dimension);

    public IComplexNDArray ifftn(IComplexNDArray transform);


    public IComplexNDArray ifftn(INDArray transform);

   //underlying ifftn
    public IComplexNDArray rawifftn(IComplexNDArray transform,int[] shape,int[] axes);
    //underlying fftn
    public IComplexNDArray rawfftn(IComplexNDArray transform,int[] shape,int[] axes);


    /**
     * Underlying fft algorithm
     * @param transform the ndarray to transform
     * @param n the desired number of elements
     * @param dimension the dimension to do fft along
     * @return the transformed ndarray
     */
    public IComplexNDArray rawfft(IComplexNDArray transform,int n,int dimension);

    /**
     * Underlying ifft impl
     * @param transform the ndarray to transform
     * @param n the desired number of elements
     * @param dimension the dimension to do fft along
     * @return
     */
    public IComplexNDArray rawifft(IComplexNDArray transform,int n,int dimension);
    /**
     * Underlying ifft impl
     * @param transform the ndarray to transform
     * @param n the desired number of elements
     * @param dimension the dimension to do fft along
     * @return
     */
    public IComplexNDArray rawifft(IComplexNDArray transform,int dimension);
    
}
