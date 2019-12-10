import java.util.Scanner;
public class Array
{
public static void main (String[] args)
{
int a[][] = new int[10][10];
int b[][] = new int[10][10];
int c[][] = new int[10][10];
Scanner sc = new Scanner(System.in);
System.out.println("enter the rows and colums of array: ");
int rows = sc.nextInt();
int columns = sc.nextInt();
for(int i=0;i<rows;i++)
{
for(int j=0;j<columns;j++)
{
a[i][j] = sc.nextInt();
b[i][j] = sc.nextInt();
c[i][j] = a[i][j]+b[i][j];}}
for(int i=0;i<rows;i++) 
{
for(int j=0;j<columns;j++) 
{
System.out.println(a[i][j]);}}
for(int i=0;i<rows;i++) 
{
for(int j=0;j<columns;j++) 
{
System.out.println(b[i][j]);}}

for(int i=0;i<rows;i++) 
{
for(int j=0;j<columns;j++) 
{
System.out.println(c[i][j]);}}
}}



